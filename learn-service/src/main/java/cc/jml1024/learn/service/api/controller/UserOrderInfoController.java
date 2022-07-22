package cc.jml1024.learn.service.api.controller;

import cc.jml1024.learn.api.dto.UserOrderInfoDTO;
import cc.jml1024.learn.api.enumerate.ResponseCode;
import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.api.response.ResultResponse;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/userOrderInfo")
public class UserOrderInfoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @GetMapping
    public ResultResponse list(@RequestBody UserOrderInfoQry qry) {
        List<UserOrderInfo> list = userOrderInfoService.getListBy(qry);
        List<UserOrderInfoDTO> dtoList = new ArrayList<>();
        ResultResponse<List<UserOrderInfoDTO>> response = null;
        try {
            if (list != null) {
                BeanUtils.copyProperties(list, dtoList);
            }
            response = new ResultResponse<>(ResponseCode.SUCCESS);
            response.setData(dtoList);
        } catch (Exception e) {
            e.printStackTrace();
            response = new ResultResponse<>(ResponseCode.FAILED);
        }
        return response;
    }

    @GetMapping(value = "/{id}")
    public ResultResponse getById(@PathVariable("id") Long id) {
        UserOrderInfo info = userOrderInfoService.getById(id);
        UserOrderInfoDTO dto = new UserOrderInfoDTO();
        ResultResponse<UserOrderInfoDTO> response = null;
        try {
            if (info != null) {
                BeanUtils.copyProperties(info, dto);
            }
            response = new ResultResponse<>(ResponseCode.SUCCESS);
            response.setData(dto);
        } catch (Exception e) {
            e.printStackTrace();
            response = new ResultResponse<>(ResponseCode.FAILED);
        }
        return response;
    }

    @GetMapping(value = "/update")
    @Transactional
    public int update() throws Exception {
        UserOrderInfo userOrderInfo = userOrderInfoService.getById(50404846L);
        ObjectMapper mapper = new ObjectMapper();
        try {
            logger.info("订单记录更新前的结果:[{}]", mapper.writeValueAsString(userOrderInfo));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        userOrderInfo.setStationId("45050000");
        return userOrderInfoService.update(userOrderInfo);
    }

}
