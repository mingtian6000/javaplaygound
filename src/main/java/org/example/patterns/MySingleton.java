package org.example.patterns;

public enum MySingleton {
    INSTANCE;
    int i;
    public void doSomething(){
        i++;
        System.out.println("now i is: "+i);
        System.out.println(INSTANCE.hashCode());
    }

    public static void main(String[] args) {
        MySingleton.INSTANCE.doSomething();
        MySingleton.INSTANCE.doSomething();
        MySingleton.INSTANCE.doSomething();
    }
}
