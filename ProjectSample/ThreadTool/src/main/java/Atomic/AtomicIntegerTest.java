package Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    static AtomicInteger atomicInteger = new AtomicInteger();//默认初始化从0开始

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    atomicInteger.incrementAndGet();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("自加十次数值：----->" + atomicInteger.get());
    }
}
