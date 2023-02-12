package Concurrent2;

import java.util.*;
import java.util.concurrent.*;

public class Handler {
    public Handler() {

    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> arl1 = new ArrayList<>();
        List<Integer> arl2 = new ArrayList<>();
        List<Integer> arl3 = new ArrayList<>();
//        arl1.add(10); arl1.add(20); arl1.add(30);
//        arl2.add(40); arl2.add(50); arl2.add(60);
//        arl3.add(70); arl3.add(80); arl3.add(90);
        int length = 4000000;
        for(int i = 0; i < length; i++){
            arl1.add((int)(Math.random() * 100));
        }

        for(int i = 0; i < length; i++){
            arl2.add((int)(Math.random() * 100));
        }

        for(int i = 0; i < length; i++){
            arl3.add((int)(Math.random() * 100));
        }

        ExecutorService exs = Executors.newCachedThreadPool();
        List<Callable<Integer>> lci = new ArrayList<>();
        lci.add(new Adder(arl1)); lci.add(new Adder(arl2)); lci.add(new Adder(arl3));

        int sum = 0;
        long time1 = System.nanoTime();

        List<Future<Integer>> lfi =  exs.invokeAll(lci);
        exs.shutdown();

        long time2 = System.nanoTime();
        for(int temp : arl1) {sum += temp;}
        for(int temp : arl2) {sum += temp;}
        for(int temp : arl3) {sum += temp;}
        long time3 = System.nanoTime();

        int result = 0;
        for (Future<Integer> temp: lfi){
            result += temp.get();
        }

        System.out.println(time2-time1); // multiithread
        System.out.println(time3-time2

        ); // onethread
        System.out.println(result);
        System.out.println(sum);
    }
}

class Adder implements Callable <Integer> {
    List<Integer> li;

    public Adder(List<Integer> li) {
        this.li = li;
    }

    public Integer call(){
        int result = 0;
        for(int temp : li) {
            result += temp;
        }
        return result;
    }
}

// Runnable - void run(){}
// Callable <T> - T call(){ return T; }