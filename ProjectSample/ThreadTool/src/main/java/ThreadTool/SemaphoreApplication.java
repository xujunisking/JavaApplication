package ThreadTool;

import java.util.concurrent.Semaphore;

public class SemaphoreApplication {

    public static void main(String[] args) {
        //流量控制，限流
        Semaphore semaphore = new Semaphore(2);
        for (int i=0; i<5; i++) {
            new Thread(new Task(semaphore, "xujun" + i)).start();
        }
    }

    static class Task extends  Thread {
        Semaphore semaphore;

        public Task(Semaphore semaphore, String tname) {
            this.semaphore = semaphore;
            this.setName(tname);
        }

        public void run() {
            try {
                semaphore.acquire();//尝试获取公共资源
                System.out.println(Thread.currentThread().getName() + "acquire() as time:" + System.currentTimeMillis());

                Thread.sleep(1000);

                semaphore.release();//释放公共资源
                System.out.println(Thread.currentThread().getName() + "release() as time:" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
