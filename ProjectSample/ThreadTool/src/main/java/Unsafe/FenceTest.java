package Unsafe;

import utils.UnsafeInstance;

public class FenceTest {
    public static void main(String[] args) {
        UnsafeInstance.reflectGetUnsafe().loadFence();//读屏障

        UnsafeInstance.reflectGetUnsafe().storeFence();//写屏障

        UnsafeInstance.reflectGetUnsafe().fullFence();//读写屏障
    }
}
