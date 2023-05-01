package org.example.basicJVM;

public class Main {
    public static void main(String[] args) {
        System.out.println("normal default main method");
        String a="我是中国人";
        System.out.println(a.length());
    }

    public static void main(int[] args) {
        System.out.println("main method need int array as args");
    }

    public static void main(double[] args) {
        System.out.println("main method need double array as args");
    }

    public static void main(String args) {
        System.out.println("main method need one string");
    }
}
