package cc.jml1024.learn.security.service;

import cc.jml1024.learn.security.entity.SysRole;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysRoleService {

    private static List<SysRole> list = new ArrayList<>();

    static {
        SysRole role = new SysRole();
        role.setId(1L);
        role.setName("ROLE_ADMIN");
        role.setDesc("系统管理员");
        list.add(role);
    }

    public SysRole getById(Long id) {
        for (SysRole r : list) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }
}
