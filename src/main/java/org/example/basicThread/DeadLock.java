package org.example.basicThread;

import lombok.SneakyThrows;

public class DeadLock {
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();


    public static void main(String[] args) {
        new Thread(()->{
            synchronized (obj1){
                System.out.println("got object1 lock! going to get object2's lock! ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj2){
                    System.out.println("got object2's lock");
                }

            }
        }).start();
        new Thread(()->{
            synchronized (obj2){
                System.out.println("got object2's lock! going to get object1's lock!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj1){
                    System.out.println("got object1's lock");
                }
            }
        }).start();
    }
}
