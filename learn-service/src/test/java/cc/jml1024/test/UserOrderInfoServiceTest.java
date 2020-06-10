package cc.jml1024.test;

import cc.jml1024.learn.service.ApplicationStartup;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStartup.class)
@Slf4j
public class UserOrderInfoServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @Test
    public void test_getById() {
        logger.info("info: [{}]", JSON.toJSON(userOrderInfoService.getById(50405179L)));
    }

    @Test
    public void test_getListBy() {
        List<UserOrderInfo> list = userOrderInfoService.getListBy();
        list.forEach(u -> {
                logger.info("info: [{}]", JSON.toJSON(u));
        });
    }
}
