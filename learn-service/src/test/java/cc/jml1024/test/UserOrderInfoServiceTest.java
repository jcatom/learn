package cc.jml1024.test;

import cc.jml1024.learn.service.ApplicationStartup;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStartup.class)
public class UserOrderInfoServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @Autowired
    private RedisTemplate redisTemplate;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test_getById() {
    }

    @Test
    public void test_getListBy() {
        List<UserOrderInfo> list = userOrderInfoService.getListBy(null);
        list.forEach(u -> {
                logger.info("info: [{}]", u);
        });
    }
}
