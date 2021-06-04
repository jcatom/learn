package cc.jml1024.learn.elasticsearch.service;

import cc.jml1024.learn.elasticsearch.document.UserOrderInfo;
import cc.jml1024.learn.elasticsearch.repository.UserOrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserOrderInfoService {
    @Autowired
    private UserOrderInfoRepository userOrderInfoRepository;

    public Page<UserOrderInfo> getListBy(Pageable pageable) {
        Page<UserOrderInfo> result = userOrderInfoRepository.findAll(pageable);
        return result;
    }

    public void save(UserOrderInfo userOrderInfo) {
        userOrderInfoRepository.save(userOrderInfo);
    }
}
