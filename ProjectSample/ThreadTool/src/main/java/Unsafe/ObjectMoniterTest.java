package Unsafe;

import sun.misc.Unsafe;
import utils.UnsafeInstance;

public class ObjectMoniterTest {
    static Object object = new Object();

    public static void main(String[] args) {
        Unsafe unsafe = UnsafeInstance.reflectGetUnsafe();

        unsafe.monitorEnter(object);
        //业务逻辑写在中间
        unsafe.monitorExit(object);
    }
}
