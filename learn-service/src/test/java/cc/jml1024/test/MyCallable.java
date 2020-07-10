package cc.jml1024.test;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println(abc(31));
    }

    public static int abc(int i) {
        if (i <= 0) {
            return 0;
        } else if (i > 0 && i <= 2) {
            return 1;
        }
        return abc(i - 1) + abc(i -2);
    }
}
