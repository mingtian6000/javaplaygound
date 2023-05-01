package org.example.proxy.dynamicDemo;

import java.lang.reflect.Proxy;

public class HelloImpl implements Hello{

    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        Hello proxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), new ProxyInvocationHandler(hello));
        proxy.sayHello();
    }
}
