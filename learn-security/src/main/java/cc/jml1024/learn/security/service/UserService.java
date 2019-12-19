package cc.jml1024.learn.security.service;

import cc.jml1024.learn.security.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void createUser(UserDetails userDetails) {
        userDao.createUser(userDetails);
    }

    public void updateUser(UserDetails userDetails) {
        userDao.updateUser(userDetails);
    }

    public void deleteUser(String username) {
        userDao.deleteUser(username);
    }

    public void changePassword(String oldPassword, String newPassword) {
        userDao.changePassword(oldPassword, newPassword);
    }

    public boolean userExits(String username) {
        return userDao.userExits(username);
    }

    public UserDetails loadUserByUsername(String username) {
        return userDao.loadUserByUsername(username);
    }
}
