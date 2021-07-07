package ThreadTool;

import java.util.concurrent.CountDownLatch;

public class SeeDoctorTack implements Runnable {

    private CountDownLatch countDownLatch;

    public SeeDoctorTack(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            System.out.println("开始看医生");
            Thread.sleep(2000);
            System.out.println("看医生结束，准备离开病房");
        } catch(InterruptedException e) {
            e.printStackTrace();
        } finally {
            countDownLatch.countDown();
        }
    }
}
