package cc.jml1024.learn.service.controller;

import cc.jml1024.learn.api.dto.UserOrderInfoDTO;
import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userOrderInfo")
public class UserOrderInfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @GetMapping("/list")
    public List<UserOrderInfoDTO> list(@RequestBody UserOrderInfoQry qry) {
        List<UserOrderInfo> list = userOrderInfoService.getListBy(qry);
        List<UserOrderInfoDTO> dtoList = new ArrayList<>();
        try {
            if (list != null) {
                BeanUtils.copyProperties(dtoList, list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dtoList;
    }

    @GetMapping("/{id}")
    public UserOrderInfoDTO getById(@PathVariable("id") Long id) {
        UserOrderInfo info = userOrderInfoService.getById(id);
        UserOrderInfoDTO dto = new UserOrderInfoDTO();
        try {
            if (info != null) {
                BeanUtils.copyProperties(dto, info);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

}
