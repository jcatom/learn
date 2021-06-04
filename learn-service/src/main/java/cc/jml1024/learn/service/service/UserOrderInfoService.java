package cc.jml1024.learn.service.service;

import cc.jml1024.learn.api.qry.UserOrderInfoQry;
import cc.jml1024.learn.service.domain.UserOrderInfo;

import java.util.List;

public interface UserOrderInfoService {

    UserOrderInfo getById(Long id);

    List<UserOrderInfo> getListBy(UserOrderInfoQry qry);
}
