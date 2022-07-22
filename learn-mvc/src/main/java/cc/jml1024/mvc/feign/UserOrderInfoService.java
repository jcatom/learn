//package cc.jml1024.mvc.feign;
//
//import cc.jml1024.learn.api.dto.UserOrderInfoDTO;
//import cc.jml1024.learn.api.qry.UserOrderInfoQry;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@FeignClient(value = "learn-service", contextId = "userOrderInfoService")
//public interface UserOrderInfoService {
//
//    @GetMapping("/userOrderInfo/{id}")
//    UserOrderInfoDTO getById(@PathVariable("id")  Long id);
//
//    @GetMapping("/userOrderInfo/list")
//    List<UserOrderInfoDTO> getList(UserOrderInfoQry qry);
//
//}