package cc.jml1024.learn.security.service;

import cc.jml1024.learn.security.entity.SysUserHasRole;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserHasRoleService {

    private static List<SysUserHasRole> list = new ArrayList<>();
    static {
        SysUserHasRole sysUserHasRole = new SysUserHasRole();
        sysUserHasRole.setUserId(1L);
        sysUserHasRole.setRoleId(1L);
        list.add(sysUserHasRole);
    }

    public List<SysUserHasRole> getListByUserId(Long userId) {
        List<SysUserHasRole> sysUserHasRoleList = new ArrayList<>();
        for (SysUserHasRole userHasRole : list) {
            if (userHasRole.getUserId().equals(userId)) {
                sysUserHasRoleList.add(userHasRole);
            }
        }
        return sysUserHasRoleList;
    }
}
