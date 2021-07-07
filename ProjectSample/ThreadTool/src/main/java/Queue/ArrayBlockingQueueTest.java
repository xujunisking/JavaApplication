package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayBlockingQueueTest {
    private ArrayBlockingQueue<Ball> blockingDeque = new ArrayBlockingQueue<Ball>(1);

    /**
     * 队列大小
     * @return
     */
    public int queueSize() {
        return blockingDeque.size();
    }

    public void produce(Ball ball) throws InterruptedException {
        blockingDeque.put(ball);
    }

    public Ball consume() throws InterruptedException {
        return blockingDeque.take();
    }

    public static void main(String[] args) {
        final ArrayBlockingQueueTest box = new ArrayBlockingQueueTest();
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit((Runnable) () -> {
           int i = 0;
           while (true) {
               Ball ball = new Ball();
               ball.setNumber("乒乓球编号：" + i);
               ball.setColor("yellow");
               try {
                    System.out.println(System.currentTimeMillis() + ":准备往箱子里放入乒乓球：---->" + ball.getNumber());
                    box.produce(ball);
                    System.out.println(System.currentTimeMillis() + "往箱子里放入乒乓球：---->" + ball.getNumber());
                    System.out.println("put操作后，当前箱子中共有乒乓球：---->" + box.queueSize() + "个");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               i++;
           }
        });

        executorService.submit((Runnable) () -> {
            while (true) {
                try {
                    System.out.println("准备到箱子里拿出乒乓球：---->");
                    Ball ball = box.consume();
                    System.out.println("拿到箱子里的乒乓球：---->" + ball.getNumber());
                    System.out.println("take操作后，当前箱子中共有乒乓球：---->" + box.queueSize() + "个");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
