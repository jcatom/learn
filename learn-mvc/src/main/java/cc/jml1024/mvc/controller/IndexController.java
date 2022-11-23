package cc.jml1024.mvc.controller;

import cc.jml1024.mvc.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private TestService testService;

    @GetMapping(value = {"/", ""})
    public String index(HttpServletRequest request, Model uiModel) {
        testService.showName();
        testService.showAge();
        String name = request.getParameter("name");
        uiModel.addAttribute("msg", "Hello " + name);
        return "index";
    }

}
