package Generics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Handler {
    public static void main(String[] args) {
//        String x = GenericMethod.display(5, "Mary");
//        int y = GenericMethod.display("STRING", 5);
        BiFunction<int[], ArrayList<Integer>, Integer> bf = (array, list) -> {
            int min = Integer.MAX_VALUE;
            int max = Collections.max(list);

            for (int temp : array) {
                if (temp < min) {
                    min = temp;
                }
            }
            return max - min;
        };

        int[] arr = {4, 7, 2, 8, 5}; // 2
        ArrayList<Integer> li = new ArrayList<>(List.of(
         7, 3, 9, 4, 6
        ));
        System.out.println(bf.apply(arr, li));

        BiFunction<int[], ArrayList<Integer>, ArrayList<Integer>> bf2 = (array, list) -> {
            ArrayList<Integer> result = new ArrayList<>();
            for(int temp : array) {
                if(temp % 2 == 0) {
                    result.add(temp);
                }
            }

            for(Integer temp : list) {
                if(temp % 2 == 0) {
                    result.add(temp);
                }
            }
            return result;
        };

        System.out.println(bf2.apply(arr, li));
    }
}

class GenericMethod {
    public static <T, V> V display(T param1, V param2) {
        System.out.println(param1);
        return param2;
    }
}
