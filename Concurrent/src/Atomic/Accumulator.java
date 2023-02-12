package Atomic;

import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.*;

public class Accumulator {
    static long sum = 0;

    public static void main(String[] args) throws InterruptedException {
/*        LongBinaryOperator lbo = Long::sum; //(x1, x2) -> { return x1 + x2; };
        LongAccumulator la = new LongAccumulator(lbo, 0);
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                la.accumulate(i); // 45
            }
        };

        Thread t1 = new Thread(r); Thread t2 = new Thread(r);
        Thread t3 = new Thread(r); Thread t4 = new Thread(r);
        t1.start(); t2.start(); t3.start(); t4.start();
//        for (int i = 0; i < 100; i++) {
//            la.accumulate(i); // 45
//        }
        Thread.sleep(1000);
        System.out.println(la.get()); // 19800
*/
        Runnable r = () -> {
            for (int i = 0; i < 30; i++) {
                if (i % 7 == 0 || i % 11 == 0) {
                    sum += i;
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(1000);
        System.out.println(sum); // 19800
    }
}
