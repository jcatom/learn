package cc.jml1024.test;

import cc.jml1024.learn.service.service.UserOrderInfoService;
import com.alibaba.fastjson.JSON;

import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyThread implements Runnable {

    private CountDownLatch latch;

    private UserOrderInfoService userOrderInfoService;

    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private Lock lock = readWriteLock.writeLock();

    public MyThread() {

    }

    public MyThread(CountDownLatch latch, UserOrderInfoService userOrderInfoService) {
        this.latch = latch;
        this.userOrderInfoService = userOrderInfoService;
    }

    @Override
    public void run() {
        try {
            System.out.println("thead standby");
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.lock();
        try {
//            Map<String, Integer> map = userOrderInfoService.getStock();
            Map<String, Integer> map = null;
            Integer stock = map.get("stock");
            if (stock > 0) {
                stock -= 1;
                map.put("stock", stock);
            }
            System.out.println(JSON.toJSON(map));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}