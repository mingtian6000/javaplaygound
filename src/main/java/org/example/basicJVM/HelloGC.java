package org.example.basicJVM;

import java.util.LinkedList;
import java.util.List;

//-Xms20m -Xmx20m -Xlog:gc add this line in your VM options
public class HelloGC {
    // The default garbage collector for both JDK11 and JDK17 is called G1
    public static void main(String[] args) {
        System.out.println("helloGC start");
        List list = new LinkedList<>();
        // if without vm options, JDK11 马上 outofMemory!!
        // so I assume there is some internal 优化
        for(;;){
            byte[] b = new byte[1024*1024];
            list.add(b);
        }
    }
}
