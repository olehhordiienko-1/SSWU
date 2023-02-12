package Lambda.labmda5;

import java.util.*;
import java.util.function.*;

public class Dispatcher {
    public static void main(String[] args) {
        Integer[] arr = {5, 7, 3, 9, 16, 12, 8, 4};
        //            T          U          R
        BiFunction<Integer[], Integer, List<Integer>> bf1 =
                (tVal, uVal) -> {
                    List<Integer> result = new ArrayList<>();
                    for (Integer temp : tVal) {
                        if (temp > uVal) {
                            result.add(temp);
                        }
                    }
                    return result;
                };
        List<Integer> list = bf1.apply(arr, 17);
        for(Integer temp : list) {
            System.out.print(temp + " ");
        }
    }
}
