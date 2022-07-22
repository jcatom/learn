//package cc.jml1024.mvc.controller;
//
//import cc.jml1024.learn.api.dto.UserOrderInfoDTO;
//import cc.jml1024.learn.api.qry.UserOrderInfoQry;
//import cc.jml1024.mvc.feign.UserOrderInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
///**
// * @author Evil
// */
//@Controller
//@RequestMapping(value = "/userOrderInfo")
//public class UserOrderInfoController {
//
//    @Autowired
//    private UserOrderInfoService userOrderInfoService;
//
//    @GetMapping(value = "/list")
//    public String list(Model uiModel, UserOrderInfoQry qry) {
//        List<UserOrderInfoDTO> list = userOrderInfoService.getList(qry);
//        uiModel.addAttribute("list", list);
//        return "userOrderInfo/list";
//    }
//
//    @GetMapping(value = "/{id}")
//    public String detail(Model uiModel, @PathVariable("id") Long id) {
//        UserOrderInfoDTO dto = userOrderInfoService.getById(id);
//        uiModel.addAttribute("dto", dto);
//        return "userOrderInfo/detail";
//    }
//}
