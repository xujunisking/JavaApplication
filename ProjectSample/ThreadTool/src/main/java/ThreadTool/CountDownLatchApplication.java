package ThreadTool;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchApplication {
    public static void main(String[] args) throws InterruptedException{
        long now = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(new SeeDoctorTack(countDownLatch)).start();
        new Thread(new QueueTask(countDownLatch)).start();
        countDownLatch.await();
        System.out.println("over, 回家 cost:" + (System.currentTimeMillis() - now));
    }
}
