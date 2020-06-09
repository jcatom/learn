package cc.jml1024.learn.customer.feign;

import cc.jml1024.learn.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("learn-service")
public interface UserService {

    @GetMapping("/user/count")
    int getCount();

    @GetMapping("/user/list")
    List<User> getResultList();

    @GetMapping("/userOrderInfo/{id}")
    Object getById(@PathVariable("id")  Long id);
}
