package Atomic;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedRerenceTest {
    private static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(1, 0);
    public static void main(String[] args) {
        Thread main = new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();//获取当前标识
            System.out.println("操作线程" + Thread.currentThread().getName() + "stamp=" + stamp + ",初始值a=" + atomicStampedReference.getReference());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean isCasSuccess = atomicStampedReference.compareAndSet(1,2, stamp, stamp +1);
            System.out.println("操作线程" + Thread.currentThread().getName() + "stamp=" + stamp + ",Cas操作结果：" + isCasSuccess);
        },"主线程");

        Thread other = new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            atomicStampedReference.compareAndSet(1,2, stamp, stamp + 1);
            System.out.println("操作线程" + Thread.currentThread().getName() + "stamp=" + atomicStampedReference.getStamp() + "increment后值：" + atomicStampedReference.getReference());
            atomicStampedReference.compareAndSet(2,1, stamp, stamp + 1);
            System.out.println("操作线程" + Thread.currentThread().getName() + "stamp=" + atomicStampedReference.getStamp() + "decrement后值：" + atomicStampedReference.getReference());
        }, "干扰线程");

        main.start();
        other.start();
    }
}
