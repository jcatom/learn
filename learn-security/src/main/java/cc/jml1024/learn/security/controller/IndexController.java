package cc.jml1024.learn.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/"})
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String index(HttpServletRequest request) {
        request.getSession().getAttribute("");
        return "index";
    }
}
