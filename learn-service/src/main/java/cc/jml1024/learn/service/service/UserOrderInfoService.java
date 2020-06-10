package cc.jml1024.learn.service.service;

import cc.jml1024.learn.service.dao.UserOrderInfoMapper;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserOrderInfoService {
    @Autowired
    private UserOrderInfoMapper userOrderInfoMapper;

    public UserOrderInfo getById(Long id) {
        return userOrderInfoMapper.selectByPrimaryKey(id);
    }

    public List<UserOrderInfo> getListBy() {
        PageHelper.startPage(1, 100);
        return userOrderInfoMapper.getListBy();
    }

}
