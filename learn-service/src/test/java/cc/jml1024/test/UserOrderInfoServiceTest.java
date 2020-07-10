package cc.jml1024.test;

import cc.jml1024.learn.service.ApplicationStartup;
import cc.jml1024.learn.service.configuration.myConfig.Person;
import cc.jml1024.learn.service.domain.UserOrderInfo;
import cc.jml1024.learn.service.service.UserOrderInfoService;
import com.alibaba.fastjson.JSON;
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
import java.util.concurrent.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStartup.class)
public class UserOrderInfoServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserOrderInfoService userOrderInfoService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private Person person;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test_getById() {
//        CountDownLatch latch = new CountDownLatch(1);
//        MyThread myThread = new MyThread(latch, userOrderInfoService);
//        for (int i = 1; i <= 110; i++) {
//            Thread thread = new Thread(myThread);
//            thread.start();
//        }
//
//        latch.countDown();
//        try {
//            Thread.currentThread().join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        userOrderInfoService.deleteById(50396621L);
//        UserOrderInfo userOrderInfo = userOrderInfoService.getById(50396621L);
//        System.out.println(JSON.toJSON(userOrderInfo));

        System.out.println(person);
    }

    @Test
    public void test_getListBy() {
        List<UserOrderInfo> list = userOrderInfoService.getListBy(null);
        list.forEach(u -> {
                logger.info("info: [{}]", JSON.toJSON(u));
        });
    }

    @Test
    public void test_callable() {
        MyCallable callable = new MyCallable();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        Future<String> future = executor.submit(callable);
        try {
            System.out.println(future.get());
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }


}
