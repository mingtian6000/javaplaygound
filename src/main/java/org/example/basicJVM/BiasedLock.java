package org.example.basicJVM;


import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

public class BiasedLock {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("not enter sync block");
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("not enter sync block");
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o){
            System.out.println("not enter sync block");
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
            o.hashCode();
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
