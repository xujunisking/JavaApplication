package ScheduledThreadPoolExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DefaultSchedulePoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);

        /**
         * 延迟1秒执行任务，只执行一次
         */
        pool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟执行");
            }
        }, 1, TimeUnit.SECONDS);

        /**
         * 延迟5秒后开始重复执行，每3秒执行一次(不管任务执行多长时间，每隔3秒就定时执行)
         */
        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("重复执行1");
            }
        },5,3, TimeUnit.SECONDS);

        pool.shutdown();

        /**
         * 任务执行完后间隔3秒再执行下一次
         */
        pool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("重复执行2");
            }
        },5,3,TimeUnit.SECONDS);
    }
}
