package cc.jml1024.learn.service.service;

import cc.jml1024.learn.api.entity.User;
import cc.jml1024.learn.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int getCount() {
        return getResultList().size();
    }

    @Override
    public List<User> getResultList() {
        List<User> list = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(11);
        for (int i = 0; i < size; i++) {
            User u = new User();
            u.setUsername(new StringBuffer("name").append(i).toString());
            u.setNickname(new StringBuffer("nickname").append(i).toString());
            u.setEmail(new StringBuffer().append(i).append("@mail.com").toString());
            u.setPhone(new StringBuffer("1389999999").append(i).toString());
            list.add(u);
        }
        return list;
    }
}
