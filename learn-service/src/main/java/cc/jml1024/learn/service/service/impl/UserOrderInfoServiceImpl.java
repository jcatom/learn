package cc.jml1024.learn.service.service.impl;

import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.dao.UserOrderInfoMapper;
import cc.jml1024.learn.service.domain.User;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import cc.jml1024.learn.service.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserOrderInfoServiceImpl implements UserOrderInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserOrderInfoMapper userOrderInfoMapper;

    private final UserService userService;

    @Autowired
    public UserOrderInfoServiceImpl(UserOrderInfoMapper userOrderInfoMapper, UserService userService) {
        this.userOrderInfoMapper = userOrderInfoMapper;
        this.userService = userService;
    }

    @Override
    public UserOrderInfo getById(Long id) {
        return userOrderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserOrderInfo> getListBy(UserOrderInfoQry qry) {
        if (qry != null && qry.getHasPaging()) {
            PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
        }
        return userOrderInfoMapper.getListBy(qry);
    }

    @Override
    @Transactional
    public int update(UserOrderInfo userOrderInfo) throws Exception {

        int count = userOrderInfoMapper.updateByPrimaryKeySelective(userOrderInfo);
        logger.info("订单记录更新记录数:[{}]", count);
        UserOrderInfo info = userOrderInfoMapper.selectByPrimaryKey(userOrderInfo.getId());
        ObjectMapper mapper = new ObjectMapper();
        try {
            logger.info("订单记录更新后的结果:[{}]", mapper.writeValueAsString(info));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setId(1L);
        user.setAge(200);
        userService.update(user);
        if (true) {
            throw new Exception();
        }
        return count;
    }
}
