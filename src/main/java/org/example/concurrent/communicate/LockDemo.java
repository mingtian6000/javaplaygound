package org.example.concurrent.communicate;

// demostrate 2 thread communicate with each other
// this demo use traditional wait& notify,note these object method
public class LockDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock){
                lock.notify();
                System.out.println("send notification!");
            }
        }, "t2").start();

        // need to let T1 goes first!! order is important
        new Thread(()->{
            synchronized (lock){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I am awoken!");
            }
        },"t1").start();
    }

}
