package org.example.sort;


import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    private static int[] generate(int length){
        int arr[] =  new int[length];
        for(int i=0; i<length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        return arr;
    }

    protected static int[] bubbleSort(int[] arr){
        // validation
        if (arr==null || arr.length==0) {
            return arr;
        }
        // do sort here
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                // the largest one into the last
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Arrays.stream(generate(10)).forEach(i -> System.out.print(i+","));
    }
}
