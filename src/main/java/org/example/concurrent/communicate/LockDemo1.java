package org.example.concurrent.communicate;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// demonstrate 2 thread communicate with each other
// this demo use reentrant Lock + condition
// 可重入锁，多个线程同时进入和拿到，但他类似于stack，配对顺序保持一致
public class LockDemo1 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition cd = lock.newCondition();

        new Thread(()->{
            lock.lock();
            try {
                System.out.println("get lock from T2");
                cd.await();
                System.out.println("waiting from T2");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally{
                System.out.println("release lock from T2");
                lock.unlock();
            }
        }, "t2").start();

        new Thread(()->{
            lock.lock();
            System.out.println("get lock from T1");
            cd.signal(); // send notification
            System.out.println("sending notification from T1");
            lock.unlock();
            System.out.println("release lock from T1");
        },"t1").start();
    }
}
