package cc.jml1024.learn.service.controller;

import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userOrderInfo")
public class UserOrderInfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @Value("${spring.application.name}")
    private String appName;
    @Value("${server.port}")
    private String port;

    @GetMapping("/get/{id}")
    public UserOrderInfo getById(@PathVariable("id") Long id) {
        logger.info("server name:[{}], server port:[{}]", appName, port);
        return userOrderInfoService.getById(id);
    }

}
