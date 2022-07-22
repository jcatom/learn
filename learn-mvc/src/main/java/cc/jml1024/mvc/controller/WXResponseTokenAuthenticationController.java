package cc.jml1024.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Controller
@RequestMapping("/wx")
public class WXResponseTokenAuthenticationController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/receiver", method = {RequestMethod.GET, RequestMethod.POST})
    public void receiver(HttpServletRequest request, HttpServletResponse response) {
        boolean isPostRequest = request.getMethod().toUpperCase().equals("POST");
        if (isPostRequest) {
            try {
                InputStream is = request.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                StringBuffer body = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    body.append(line);
                }
                logger.info("body:[{}]", body);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }  else {
            String signature = request.getParameter("signature");
            String timestamp = request.getParameter("timestamp");
            String nonce = request.getParameter("nonce");
            String echostr = request.getParameter("echostr");
            logger.info("signature : [{}]", signature);
            if (checkoutSignature("Evil", signature, timestamp, nonce)) {
                PrintWriter writer = null;
                try {
                    writer = response.getWriter();
                    writer.write(echostr);
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (writer != null) {
                        writer.close();
                    }
                }
            }
        }
    }

    private boolean checkoutSignature(String token, String signature, String timestamp, String nonce) {
        String[] paramArray = {token, timestamp, nonce};
        Arrays.sort(paramArray);
        StringBuffer paramStr = new StringBuffer();
        for (int i = 0; i < paramArray.length; i++) {
            paramStr.append(paramArray[i]);
        }
        String param = paramStr.toString();
        String digestStr = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(param.getBytes());
            byte[] digest = md.digest();
            StringBuffer hexstr = new StringBuffer();
            String shaHex = "";
            for (int i = 0; i < digest.length; i++) {
                shaHex = Integer.toHexString(digest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexstr.append(0);
                }
                hexstr.append(shaHex);
            }
            digestStr = hexstr.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        logger.info("digestStr : [{}]", digestStr);
        return digestStr.equals(signature);
    }
}
