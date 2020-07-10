package cc.jml1024;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

public class ConcurrentTest {
    private final int THREAD_NUMBER = 1000;
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);

        MyThread thread = new MyThread(latch);
        for (int i = 1; i <= 1000; i++) {
            Thread t = new Thread(thread);
            t.setName("name" + i);
            t.start();
        }
        latch.countDown();
    }

    @Test
    public void test_concurrentTest() {
        CountDownLatch latch = new CountDownLatch(1);
        MyThread thread = new MyThread(latch);
        for (int i = 1; i <= 100; i++) {
            Thread t = new Thread(thread);
            t.setName("name" + i);
            t.start();
        }
        latch.countDown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class MyThread implements Runnable {

    private CountDownLatch latch;

    public MyThread() {

    }

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            System.out.println("thead standby");
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        InputStream in = null;
        InputStreamReader inReader = null;
        BufferedReader reader = null;
        try {
            URL url = new URL("http://localhost:8089/userOrderInfo");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.connect();
            in = connection.getInputStream();
            inReader = new InputStreamReader(in);
            reader = new BufferedReader(inReader);
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }
}
