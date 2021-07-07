package XJThreadPoolExecutor;

import XJThreadPoolExecutor.policy.DefaultPolicyHandler;

public class Test {
    public static void main(String[] args) {
        XJThreadPoolExecutor pool = new XJThreadPoolExecutor(3, 3, 60, new DefaultPolicyHandler());
        for (int i = 0; i < 10; i++) {
            pool.execute(new Task(i));
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
