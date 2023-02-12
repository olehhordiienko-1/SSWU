package Atomic;

import java.util.concurrent.atomic.LongAdder;

public class Handler {
//    static long counter = 0;
    public static void main(String[] args) throws InterruptedException {
        LongAdder counter = new LongAdder();
        Runnable r = () -> {
            for(int i = 0; i < 100; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r); Thread t2 = new Thread(r);
        Thread t3 = new Thread(r); Thread t4 = new Thread(r);
        t1.start(); t2.start(); t3.start(); t4.start();
        Thread.sleep(1000);
        System.out.println(counter.sum());

/*        Runnable r = () -> {
          for(int i = 0; i < 100; i++){
            counter++;
          }
        };

        Thread t1 = new Thread(r); Thread t2 = new Thread(r);
        Thread t3 = new Thread(r); Thread t4 = new Thread(r);
        t1.start(); t2.start(); t3.start(); t4.start();
//        Thread.sleep(20);
        t1.join(); t2.join(); t3.join(); t4.join();
        System.out.println(counter);*/


    }
}
