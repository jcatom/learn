package cc.jml1024.learn.customer.controller;

import cc.jml1024.learn.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @GetMapping("/count")
    public int getCount() {
        return 1;
    }
}
