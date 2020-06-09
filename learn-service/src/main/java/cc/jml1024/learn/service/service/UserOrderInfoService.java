package cc.jml1024.learn.service.service;

import cc.jml1024.learn.service.dao.UserOrderInfoMapper;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserOrderInfoService {
    @Autowired
    private UserOrderInfoMapper userOrderInfoMapper;

    public UserOrderInfo getById(Long id) {
        return userOrderInfoMapper.selectByPrimaryKey(id);
    }

}
