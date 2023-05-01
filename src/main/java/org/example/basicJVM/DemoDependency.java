package org.example.basicJVM;

public class DemoDependency {

    public static void main(String[] args) {
        B b = new B();  //StackOverflowError
    }
}

class A{
    private B b= new B();
}
class B{
    //private volatile A a;
    private A a = new A();
}
