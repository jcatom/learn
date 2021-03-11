package cc.jml1024.learn.security.service;

import cc.jml1024.learn.security.common.enums.UserStatusEnum;
import cc.jml1024.learn.security.entity.SysRole;
import cc.jml1024.learn.security.entity.SysUser;
import cc.jml1024.learn.security.entity.SysUserHasRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SysUserService {

    @Autowired
    private SysRoleService roleService;
    @Autowired
    private SysUserHasRoleService userHasRoleService;
    private static List<SysUser> list = new ArrayList<>();
    static {
        SysUser user = new SysUser();
        user.setUsername("evil");
        user.setPassword("111111");
        user.setEmail("jml1024@hotmail.com");
        user.setPhone("13000000000");
        user.setEnabled(new Boolean(true));
        user.setStatus(UserStatusEnum.ON);
        user.setId(1L);
        list.add(user);
    }

    public SysUser getByUsername (String username) {
        SysUser user = null;
        for (SysUser u : list) {
            if (u.getUsername().equals(username)) {
                user = u;
                break;
            }
        }

        List<SysUserHasRole> userHasRoleList = userHasRoleService.getListByUserId(user.getId());
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (SysUserHasRole userHasRole : userHasRoleList) {
            SysRole role = roleService.getById(userHasRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        user.setAuthorities(authorities);
        return user;
    }

}
