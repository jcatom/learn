package cc.jml1024.learn.service.service.impl;

import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.dao.UserOrderInfoMapper;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class UserOrderInfoServiceImpl implements UserOrderInfoService {

    private final UserOrderInfoMapper userOrderInfoMapper;

    @Autowired
    public UserOrderInfoServiceImpl(UserOrderInfoMapper userOrderInfoMapper) {
        this.userOrderInfoMapper = userOrderInfoMapper;
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
}
