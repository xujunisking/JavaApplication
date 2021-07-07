package XJThreadPoolExecutor;

public interface XJExcecutorService {

    public void execute(Runnable task);

    public void shutdown();

    public int getCorePoolSize();

    public Runnable getTask();
}
