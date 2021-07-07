package ThreadTool;

import java.util.concurrent.Exchanger;

public class ExchangerTest {
    public static void main(String[] args) {
        final Exchanger<Integer> exchanger = new Exchanger<>();
        for (int i = 0; i < 10; i++) {
            final Integer num = i;
            /*(Thread) run() -> {

                    System.out.println("所有特工到达屏障，准备开始执行任务");
            }.start();*/
        }
    }
}
