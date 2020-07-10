package cc.jml1024.learn.security.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/"})
    @PreAuthorize("ADMIN")
    public String index(HttpServletRequest request) {
        Object localeResolver = request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        System.out.println(JSON.toJSON(localeResolver));
        return "index";
    }

    @RequestMapping("/about")
    public String list() {
        return "about";
    }
}
