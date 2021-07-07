package XJThreadPoolExecutor.policy;

import XJThreadPoolExecutor.XJThreadPoolExecutor;

public interface PolicyHandler {
    /**
     * 拒绝策略
     * @param task
     * @param executor
     */
    void rejected(Runnable task, XJThreadPoolExecutor executor);
}
