package org.example.basicThread;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("create by thread");
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("create by Runnable");
    }
}
class MyCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("create by Callable");
        return "created by Callable";
    }
}
public class NewThreads {

    public void method1() {
        Thread t = new MyThread();
        t.start();

    }
    public void method2() {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
    public void method3() {
        Thread t = new Thread(new FutureTask<String>(new MyCallable()));
        t.start();

    }

    public static void main(String[] args)throws InterruptedException {
        //without call method ,lets see how many threads running here?
        System.out.println(Thread.activeCount());
        Set<Thread> ts = Thread.getAllStackTraces().keySet();
        ts.stream().forEach(i-> System.out.println(i.getId()+" , "+i.getName()));

        NewThreads nt = new NewThreads();
        nt.method1();
        nt.method2();
        nt.method3();


    }
}
