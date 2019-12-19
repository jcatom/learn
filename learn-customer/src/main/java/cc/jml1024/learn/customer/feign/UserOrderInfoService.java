package cc.jml1024.learn.customer.feign;

import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/userOrderInfo")
public interface UserOrderInfoService {

    @RequestMapping("/get/{id}")
    Object getById(Long id);

}
