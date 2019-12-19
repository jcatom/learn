package cc.jml1024.learn.service.service;

import cc.jml1024.learn.service.dao.UserOrderInfoMapper;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.repository.UserOrderInfoRepository;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserOrderInfoService {
    @Autowired
    private UserOrderInfoMapper userOrderInfoMapper;

    @Autowired
    private UserOrderInfoRepository userOrderInfoRepository;

    public UserOrderInfo getById(Long id) {
        return userOrderInfoMapper.selectByPrimaryKey(id);
    }



    public void delete(Long id) {
        userOrderInfoRepository.deleteAll();
    }

    public void init(Long count) {
        Long pageTotal = 0L;
        if (count % 30L > 0) {
            pageTotal = count / 30L + 1;
        } else {
            pageTotal = count / 30L;
        }

        for (int page = 0; page <= 3; page++) {
            PageHelper.offsetPage(page, 30);
            List<UserOrderInfo> list = userOrderInfoMapper.getListBy();
            userOrderInfoRepository.saveAll(list);
        }
    }

}
