package org.example.patterns;

public class Singleton {

    //1, its private, 2, its volatile
    private static volatile Singleton instance;
    private static Object mutex = new Object();
    //double check logging, DCL mode
    //如果只考虑单例而不是线程安全，不需要sync也不需要DCL
    public static Singleton getInstance(){
        if(instance == null){
            // can also use "ABC", but String is not a good candidate, as it may be used by anther peice of code
            //synchronized (mutex){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
