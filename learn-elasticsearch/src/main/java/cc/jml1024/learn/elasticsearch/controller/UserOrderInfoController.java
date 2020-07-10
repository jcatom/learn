package cc.jml1024.learn.elasticsearch.controller;

import cc.jml1024.learn.elasticsearch.document.UserOrderInfo;
import cc.jml1024.learn.elasticsearch.service.UserOrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userOrderInfo")
public class UserOrderInfoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @GetMapping("/list")
    public Page<UserOrderInfo> getListBy(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return userOrderInfoService.getListBy(pageable);
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id) {
        return "show";
    }

    @PostMapping
    public String save() {
        logger.info("save method execute");
        return "save";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id) {
        return "update";
    }
}
