package cc.jml1024.learn.service.dao;

import cc.jml1024.learn.api.qry.UserQry;
import cc.jml1024.learn.service.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getListBy(UserQry qry);

    public Long getListByCount();
}