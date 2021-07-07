package Atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdateTest {
    static AtomicIntegerFieldUpdater aifu = AtomicIntegerFieldUpdater.newUpdater(Student.class, "old");

    public static void main(String[] args) {
        AtomicStudentAgeUpdater stu = new AtomicStudentAgeUpdater("徐俊", 22);
        System.out.println(aifu.getAndIncrement(stu));
        System.out.println(aifu.get(stu));
    }

    static class Student {
        private String name;
        public volatile int old;

        public Student(String name, int old) {
            this.name = name;
            this.old = old;
        }

        public String getName() {
            return name;
        }

        public int getOld() {
            return old;
        }
    }
}
