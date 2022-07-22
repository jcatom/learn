package cc.jml1024.learn.service.service;

import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.domain.UserOrderInfo;

import java.util.List;

public interface UserOrderInfoService {

    int update(UserOrderInfo userOrderInfo) throws Exception;

    UserOrderInfo getById(Long id);

    List<UserOrderInfo> getListBy(UserOrderInfoQry qry);
}
