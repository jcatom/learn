package cc.jml1024.test;

import cc.jml1024.learn.service.ApplicationStartup;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStartup.class)
@Slf4j
public class UserOrderInfoServiceTest {

    @Autowired
    private UserOrderInfoService userOrderInfoService;


    @Test
    public void test_delete() {
        Long id = 1234565L;
        userOrderInfoService.delete(id);
    }

    @Test
    public void init() {
        userOrderInfoService.init(0L);
    }
}