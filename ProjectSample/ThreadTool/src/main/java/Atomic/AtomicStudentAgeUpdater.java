package Atomic;

import sun.misc.Unsafe;
import utils.UnsafeInstance;


public class AtomicStudentAgeUpdater {
    private String name;
    public volatile int age;

    private static final Unsafe unsafe = UnsafeInstance.reflectGetUnsafe();
    private static final long valueOffset;

    static  {
        try {
            valueOffset = unsafe.objectFieldOffset(AtomicStudentAgeUpdater.class.getDeclaredField("age"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public void compareAndSwapAge(int old, int target) {
        unsafe.compareAndSwapInt(this, valueOffset, old, target);
    }

    public AtomicStudentAgeUpdater(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        AtomicStudentAgeUpdater updater = new AtomicStudentAgeUpdater("徐俊", 18);
        updater.compareAndSwapAge(18, 23);
        System.out.println("真实的徐俊年龄---" + updater.getAge());
    }
}


