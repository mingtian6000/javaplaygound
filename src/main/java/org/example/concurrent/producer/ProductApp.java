package org.example.concurrent.producer;

import java.util.List;
import java.util.PrimitiveIterator;

class Producer implements Runnable{
    private Product[] products = new Product[10];

    @Override
    public void run() {
        int count=0;
        while(count<10){

        }
    }
}

class Consumer implements Runnable{
    private Product product;

    @Override
    public void run() {

    }
}

public class ProductApp {
}
