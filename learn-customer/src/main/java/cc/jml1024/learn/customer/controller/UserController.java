package cc.jml1024.learn.customer.controller;


import cc.jml1024.learn.api.entity.User;
import cc.jml1024.learn.customer.feign.UserService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GetMapping("/count")
    public int getCount() {
        return userService.getCount();
    }

    @GetMapping("/list")
    public List<User> getRelustList() {
        List<User> list = userService.getResultList();
        list.forEach(u -> {
            logger.info("user info: [{}]", JSON.toJSON(u));
        });
        return list;
    }
}
