package org.example.concurrent.communicate;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

// demonstrate 2 thread communicate with each other
// this demo use LockSuport park&unpark
public class LockDemo2 {

    public static void main(String[] args) {
        Thread t2 = new Thread(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            LockSupport.park();
            System.out.println("stopped processing");
        },"t2");
        t2.start();

        new Thread(()->{
            LockSupport.unpark(t2);
            System.out.println("start processing");
        },"t1").start();
    }
}
