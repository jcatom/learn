package cc.jml1024.learn.security.dao;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<String, UserDetails> userTable = new HashMap<>();
    static {
        UserDetails evil = User.withUsername("evil").password("{noop}123456").authorities(AuthorityUtils.NO_AUTHORITIES).build();
        userTable.put("evil", evil);
    }

    public void createUser(UserDetails userDetails) {
        userTable.putIfAbsent(userDetails.getUsername(), userDetails);
    }

    public void updateUser(UserDetails userDetails) {
        userTable.put(userDetails.getUsername(), userDetails);
    }

    public void deleteUser(String username) {
        userTable.remove(username);
    }

    public void changePassword(String oldPassword, String newPassword) {
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        if (currentUser == null) {
            throw new AccessDeniedException("change password error");
        }

        String username = currentUser.getName();
        UserDetails user = userTable.get(username);

        if (user == null) {
            throw new IllegalStateException("Current user doesn't exit in database!");
        }
    }

    public boolean userExits(String username) {
        return userTable.containsKey(username);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userTable.get(username);
    }
}
