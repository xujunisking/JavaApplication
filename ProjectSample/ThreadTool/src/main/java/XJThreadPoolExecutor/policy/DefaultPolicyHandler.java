package XJThreadPoolExecutor.policy;

import XJThreadPoolExecutor.XJThreadPoolExecutor;
import XJThreadPoolExecutor.exception.PolicyException;

public class DefaultPolicyHandler implements PolicyHandler {

    public DefaultPolicyHandler() {}

    public void rejected(Runnable task, XJThreadPoolExecutor executor) {
        System.out.println("任务已经满了！");
        throw new PolicyException("任务已经满了！");
    }
}
