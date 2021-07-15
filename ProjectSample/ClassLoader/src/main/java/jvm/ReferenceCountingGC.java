package jvm;

public class ReferenceCountingGC {
    Object instance = null;

    //引用计数法无法回收
    public static void main(String[] args) {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
    }
}
