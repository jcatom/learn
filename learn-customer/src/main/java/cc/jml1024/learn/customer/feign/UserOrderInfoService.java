package cc.jml1024.learn.customer.feign;

import cc.jml1024.learn.api.dto.UserOrderInfoDTO;
import cc.jml1024.learn.api.response.ResultResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "learn-service", contextId = "userOrderInfoService")
public interface UserOrderInfoService {

    @GetMapping("/userOrderInfo/{id}")
    ResultResponse<UserOrderInfoDTO> getById(@PathVariable("id")  Long id);

}
