package cc.jml1024.mvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController("/file")
public class FileUploadController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/uploadFile")
    public void uploadFile(HttpServletRequest request, Map<String, Object> fileMatedate) throws JsonProcessingException {
        logger.info("file matedate : [{}]", new ObjectMapper().writeValueAsString(fileMatedate));
    }
}
