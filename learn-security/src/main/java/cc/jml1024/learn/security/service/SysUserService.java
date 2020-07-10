package cc.jml1024.learn.security.service;

import cc.jml1024.learn.security.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserService {

    private static List<SysUser> list = new ArrayList<>();

    static {
        SysUser user = new SysUser();
        user.setUsername("evil");
        user.setPassword("111111");
        user.setEmail("jml1024@hotmail.com");
        user.setPhone("13000000000");
        user.setId(1L);
        list.add(user);
    }

    public SysUser getByUsername (String username) {
        SysUser user = null;
        for (SysUser u : list) {
            if (u.getUsername().equals(username)) {
                user = u;
            }
        }
        return user;
    }

}
