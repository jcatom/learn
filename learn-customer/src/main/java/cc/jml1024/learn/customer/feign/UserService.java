package cc.jml1024.learn.customer.feign;

import cc.jml1024.learn.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("learn-service")
@RequestMapping("/user")
public interface UserService {

    @RequestMapping("/count")
    int getCount();

    @RequestMapping("list")
    List<User> getResultList();
}
