package cc.jml1024.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @Autowired
    private JmsTemplate jmsTemplate;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model uiModel) {
        String name = request.getParameter("name");
        uiModel.addAttribute("msg", "Hello " + name);
        jmsTemplate.convertAndSend("mailBox", "{\"name\":\"" + name + "\"}");
        jmsTemplate.convertAndSend("mailBox", name);
        logger.info("hello world");
        return "index";
    }

}
