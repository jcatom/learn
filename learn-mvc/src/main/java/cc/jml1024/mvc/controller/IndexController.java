//package cc.jml1024.mvc.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class IndexController {
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(HttpServletRequest request, Model uiModel) {
//        String name = request.getParameter("name");
//        uiModel.addAttribute("msg", "Hello " + name);
//        return "index";
//    }
//
//}
