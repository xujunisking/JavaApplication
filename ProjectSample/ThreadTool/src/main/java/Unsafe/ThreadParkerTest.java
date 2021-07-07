package Unsafe;

import java.util.concurrent.locks.LockSupport;

public class ThreadParkerTest {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread is running-----");
                LockSupport.park();//阻塞当前线程
                System.out.println("thread is over--------");
            }
        });

        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LockSupport.unpark(t);//唤醒阻塞的线程

        //相当于先往池子里放了一张票据
//        LockSupport.unpark(Thread.currentThread());
//        System.out.println("i'm sunning step 1");
        //拿出票据使用
//        LockSupport.park();

        System.out.println("main thread is over");
    }
}
