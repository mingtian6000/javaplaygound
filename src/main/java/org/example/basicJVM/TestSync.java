package org.example.basicJVM;

// how can verify these are diff locks?
public class TestSync {

    synchronized static void m1(){
        System.out.println("enter static sync method!");
    }

    synchronized void m2(){
        System.out.println("enter sync method");
    }

    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {
            System.out.println("enter sync block!");
        }
        System.out.println("exit sync block!");

        TestSync.m1();
        System.out.println("exit sync method!");
        new TestSync().m2();
        System.out.println("exit sync method!");
    }
}
