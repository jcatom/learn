package cc.jml1024.learn.elasticsearch.controller;

import cc.jml1024.learn.elasticsearch.document.UserOrderInfo;
import cc.jml1024.learn.elasticsearch.service.UserOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userOrderInfo")
public class UserOrderInfoController {
    @Autowired
    private UserOrderInfoService userOrderInfoService;
    @GetMapping("/save")
    public void save() {
        UserOrderInfo userOrderInfo = new UserOrderInfo();
        userOrderInfo.setId(1234565L);
        userOrderInfo.setStationId("aaaaa");
        userOrderInfoService.save(userOrderInfo);
    }

    @GetMapping("/list")
    public Page<UserOrderInfo> getListBy(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return userOrderInfoService.getListBy(pageable);
    }
}
