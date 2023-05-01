package org.example.proxy.dynamicDemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

interface Image {
    void display();
}

// Real subject class
class RealImage implements Image {
    private String fileName;

    //Superclass has no null constructors but no arguments were given
    // 一但有final的属性或者方法就玩完。。
    public RealImage(){}
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

// Method interceptor class
class ImageInterceptor implements MethodInterceptor {
    private final RealImage realImage;

    public ImageInterceptor(RealImage realImage) {
        this.realImage = realImage;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (method.getName().equals("display")) {
            System.out.println("Before display");
            realImage.display();
            System.out.println("After display");
        } else {
            return method.invoke(realImage, args);
        }
        return null;
    }
}
public class MyApp {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealImage.class);
        enhancer.setCallback(new ImageInterceptor(new RealImage("test.jpg")));
        Image image = (Image) enhancer.create();
        image.display();
    }
}
