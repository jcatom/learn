package cc.jml1024.mvc.test;

import org.junit.Test;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestForOperator {

    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 8, 30000, TimeUnit.MILLISECONDS, null);

    @Test
    public void test_thread() {

    }


}
