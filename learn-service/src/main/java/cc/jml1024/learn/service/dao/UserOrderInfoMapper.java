package cc.jml1024.learn.service.dao;

import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrderInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserOrderInfo record);

    int insertSelective(UserOrderInfo record);

    UserOrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserOrderInfo record);

    int updateByPrimaryKey(UserOrderInfo record);

    List<UserOrderInfo> getListBy(UserOrderInfoQry qry);

    public Long getListByCount();
}