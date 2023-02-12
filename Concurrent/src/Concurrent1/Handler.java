package Concurrent1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Handler {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for(int i = 0; i < 5; i++) {
                try{
                    Thread.sleep(1000);
                    System.out.println("i = " + i);
                } catch (InterruptedException interruptedException){
                    System.out.println();
                }
            }
        };
//        new Thread(r1).start();
//        new Thread(r1).start();
//        new Thread(r1).start();
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
        ExecutorService ex = Executors.newFixedThreadPool(count);//newCachedThreadPool();
        ex.execute(r1);
        ex.execute(r1);
        ex.execute(r1);

        for(int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println("i = " + i);
            } catch (InterruptedException interruptedException){
                System.out.println();
            }
        }

        ex.shutdown(); // all threads were closed!
    }
}
