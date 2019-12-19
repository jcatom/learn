package cc.jml1024.learn.customer.controller;


import cc.jml1024.learn.customer.feign.UserOrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userOrderInfo")
public class UserOrderInfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @GetMapping("/get/{id}")
    public Object getById(@PathVariable Long id) {
        return userOrderInfoService.getById(id);
    }

}
