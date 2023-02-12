package ConcurrentCollections;

import java.util.*;
import java.util.concurrent.*;

public class Handler {
    public static Long count;

    public static void main(String[] args) throws InterruptedException {
        List<String> ls = new ArrayList<>(List.of(
                "Serg", "Mary", "Ron", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Pete"
        ));

        List<String> ls2 = new ArrayList<>(List.of(
                "Serg", "Mary", "Ron", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Pete"
        ));

        List<String> ls3 = new ArrayList<>(List.of(
                "Serg", "Mary", "Ron", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Max",
                "Lucy", "Mary", "Bred", "Ann", "Pete"
        ));

//        ConcurrentHashMap<String, Long> words = new ConcurrentHashMap<>();

        Map<String, Long> words = Collections.synchronizedMap(new HashMap<>());
        // Serg 1; Mary 3; Lucy 2; Ron 1; Bred 2; Ann 3; Max2; Pete 1;
        Set<String> ss = new TreeSet<>();
        for (String temp : ls) {
            ss.add(temp);
        }

        Runnable r = () -> {
            for (String temp : ls) {
//                count = words.get(temp);
//                count = count == null ? 1 : ++count;
//                words.put(temp, count);
                words.compute(temp, (key, value) -> value == null? 1 : ++value);
            }
        };

        class MyThread extends Thread {
            List<String> list;

            public MyThread(List<String> list, Runnable r) {
                super(r);
                this.list = list;
            }
        }

        Thread t1 = new MyThread(ls, r);
        Thread t2 = new MyThread(ls2, r);
        Thread t3 = new MyThread(ls3, r);
        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();

        System.out.println(words);
    }
}
