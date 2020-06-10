package cc.jml1024.learn.customer.feign;

import cc.jml1024.learn.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "learn-service", contextId = "userService")
public interface UserService {

    @GetMapping("/user/count")
    int getCount();

    @GetMapping("/user/list")
    List<User> getResultList();

}
