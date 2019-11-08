package cc.jml1024.learn.service.controller;

import cc.jml1024.learn.api.entity.User;
import cc.jml1024.learn.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getUserList() {
        return userService.getResultList();
    }

    @GetMapping("/count")
    public int getCount() {
        return userService.getCount();
    }

}
