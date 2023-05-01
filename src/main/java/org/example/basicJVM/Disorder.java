package org.example.basicJVM;

// seems cannot re-produce??
public class Disorder {
    public static int x = 0, y = 0;
    public static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException{
        int i=0;
        for(;;){
            i++;
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    shortWait(1000);
                        a = 1;
                        x = b;
                }
            });

            Thread two = new Thread(new Runnable() {
                @Override
                public void run() {
                        b = 1;
                        y = a;
                }
            });

            one.start(); two.start();
            one.join(); two.join();

            String result = "loop "+ i+" times, x is " + x + " y is " + y;
            if( x == 0 && y == 0 ){
                System.out.println(result);
                break;
            }else{
                System.out.println(result);
            }
        }
    }

    public static void shortWait(long interval){
        long start = System.nanoTime();
        long end;
        do{
            end = System.nanoTime();
        }while(start + interval >=end);
    }
}
