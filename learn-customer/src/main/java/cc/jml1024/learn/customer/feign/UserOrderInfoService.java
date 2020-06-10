package cc.jml1024.learn.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "learn-service", contextId = "userOrderInfoService")
public interface UserOrderInfoService {

    @GetMapping("/userOrderInfo/get/{id}")
    Object getById(@PathVariable("id")  Long id);

}
