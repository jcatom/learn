package cc.jml1024.learn.service.service;

import cc.jml1024.learn.api.qry.UserQry;
import cc.jml1024.learn.service.domain.User;

import java.util.List;

public interface UserService {

    int update(User user) throws Exception;

    User getById(Long id);

    List<User> getListBy(UserQry qry);
}
