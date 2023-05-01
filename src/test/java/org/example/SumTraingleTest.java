package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.example.sort.SumTriangle.triangleWithHashMap;

public class SumTraingleTest {

    HashMap<String, int[]> trig;

    HashMap<String, int[]> result;
    @BeforeEach
    public void setup(){
        trig = new HashMap<>();

    }
    @Test
    public void testTriangleWithHashMap(){
        int depth = 5;
        result = triangleWithHashMap(depth, trig);
        for(int i=1; i<depth+1; i++){
            Arrays.stream(result.get(String.valueOf(i))).forEach(j ->System.out.print(j+","));
            System.out.println();
        }
    }

    @Test
    public void testTriangleWithHashMapOnly1(){
        int depth=1;
        result = triangleWithHashMap(depth, trig);
        for(int i=1; i<depth+1; i++){
            Arrays.stream(result.get(String.valueOf(i))).forEach(j ->System.out.print(j+","));
            System.out.println();
        }
    }
}
