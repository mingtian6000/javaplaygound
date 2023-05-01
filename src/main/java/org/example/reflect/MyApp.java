package org.example.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private int myInt;
    public String myString;

    public void myMethod(int x) {
        System.out.println("myMethod called with argument: " + x);
    }
}

class MyApp {
    public static void main(String[] args) throws Exception {
        // Get the class object for MyClass
        Class<?> cls = MyClass.class;

        // Get the fields of MyClass
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
        }

        // Get the methods of MyClass
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }

        // Create an instance of MyClass using reflection
        Object obj = cls.getDeclaredConstructor().newInstance();

        // Set the value of the myInt field using reflection
        Field intField = cls.getDeclaredField("myInt");
        intField.setAccessible(true);
        intField.setInt(obj, 42);

        // Get the value of the myString field using reflection
        Field stringField = cls.getDeclaredField("myString");
        String myString = (String) stringField.get(obj);
        System.out.println("myString value: " + myString);

        // Call the myMethod method using reflection
        Method method = cls.getDeclaredMethod("myMethod", int.class);
        method.invoke(obj, 123);
    }
}