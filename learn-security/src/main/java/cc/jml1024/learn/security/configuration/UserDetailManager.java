package cc.jml1024.learn.security.configuration;

import cc.jml1024.learn.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserDetailManager implements UserDetailsManager {

    @Autowired
    private UserService userService;

    @Override
    public void createUser(UserDetails userDetails) {
        userService.createUser(userDetails);
    }

    @Override
    public void updateUser(UserDetails userDetails) {
        userService.updateUser(userDetails);
    }

    @Override
    public void deleteUser(String username) {
        userService.deleteUser(username);
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        userService.changePassword(oldPassword, newPassword);
    }

    @Override
    public boolean userExists(String username) {
        return userService.userExits(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userService.loadUserByUsername(username);
    }
}
