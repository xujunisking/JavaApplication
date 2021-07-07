package edu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTask {
    public static void main(String[] args) {
        FutureTask ft = new FutureTask<String>(new CallTask());

        Thread t = new Thread(ft);
        t.start();

        try {
            System.out.println("out put:" + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
