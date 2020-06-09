package cc.jml1024.learn.service.controller;

import cc.jml1024.learn.api.entity.User;
import cc.jml1024.learn.api.service.UserService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @Value("${spring.application.name}")
    private String appName;
    @Value("${server.port}")
    private String port;

    @GetMapping("/list")
    public List<User> getUserList() {
        logger.info("server name:[{}], server port:[{}]", JSON.toJSON(appName), port);
        return userService.getResultList();
    }

    @GetMapping("/count")
    public int getCount() {
        return userService.getCount();
    }

}
