package Atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayTest {
    static int[] value = new int[] {1,2};
    static AtomicIntegerArray aiArray = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        aiArray.getAndSet(0, 3);
        System.out.println(aiArray.get(0));
        System.out.println(value[0]);
    }
}
