package TaskForParallel;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Dispatcher {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
//        for(int i = 0; i < numbers.length; i++) {
//            numbers[i] = ;
            Arrays.parallelSetAll(numbers, number -> (int)(Math.random() * 100000 - 1));
//        }
        System.out.println(Arrays.toString(numbers));
        // Default Stream
        long startTime1 = System.currentTimeMillis();
        System.out.println(Controller.findEvenAndRepeats(numbers));
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);

        // Parallel Stream
        long startTime2 = System.currentTimeMillis();
        System.out.println(Controller.findEvenAndRepeatsParallel(numbers));
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }
}

class Controller {
    public static SortedMap<Integer, Integer> findEvenAndRepeats(int[] array) {
        SortedMap<Integer, Integer> repeats = Collections.synchronizedSortedMap(new TreeMap<>());
        Arrays.stream(array).forEach(number -> {
                if(number % 2 == 0) {
                    repeats.put(number, repeats.containsKey(number)? repeats.get(number) + 1 : 1);
                }
        });
        return repeats;
    }

    public static SortedMap<Integer, Integer> findEvenAndRepeatsParallel(int[] array) {
        SortedMap<Integer, Integer> repeats = Collections.synchronizedSortedMap(new TreeMap<>());
        Arrays.stream(array).parallel().forEach(number -> {
            if(number % 2 == 0) {
                repeats.put(number, repeats.containsKey(number)? repeats.get(number) + 1 : 1);
            }
        });
        return repeats;
    }
}
