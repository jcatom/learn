package cc.jml1024.learn.service.service.impl;

import cc.jml1024.learn.api.qry.UserQry;
import cc.jml1024.learn.service.dao.UserMapper;
import cc.jml1024.learn.service.domain.User;
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
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getListBy(UserQry qry) {
        if (qry != null && qry.getHasPaging()) {
            PageHelper.startPage(qry.getPageNum(), qry.getPageSize());
        }
        return userMapper.getListBy(qry);
    }

    @Override
    @Transactional
    public int update(User user) throws Exception {
        int count = userMapper.updateByPrimaryKeySelective(user);
        logger.info("订单记录更新记录数:[{}]", count);
        User info = userMapper.selectByPrimaryKey(user.getId());
        ObjectMapper mapper = new ObjectMapper();
        try {
            logger.info("订单记录更新后的结果:[{}]", mapper.writeValueAsString(info));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
//        if (true) {
//            throw new Exception();
//        }
        return count;
    }
}
