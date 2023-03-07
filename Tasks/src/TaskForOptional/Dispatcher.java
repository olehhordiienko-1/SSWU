package TaskForOptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class Dispatcher {
    public static void main(String[] args) {
        // task 1
        String[] words1 = {"Hello", "Some", "Excellent", "Perfect", "Gripping", "Tedious"};
        String[] words2 = {"Java", "Python", "C++", ".NET", "JS", "Ruby"};

        List<String> general = Stream.concat(Arrays.stream(words1), Arrays.stream(words2)).sorted().toList();
        System.out.println(general);

        // task 2
        int[] averageNums = {1, -3, 3, 15, -20, 19, 16, 11, -6};
//        double average = ((double) Arrays.stream(averageNums).reduce(0, Integer::sum)) / averageNums.length;
        double average = Arrays.stream(averageNums).average().getAsDouble();
        System.out.println(Arrays.toString(averageNums) + " average= " + average + " count= " +
                Arrays.stream(averageNums).filter(number -> number > average).count());

        // task 3
        List<Integer> duplicateNums = new ArrayList<>(List.of(
                21, 13, 4, 5, -21, 21, 6, 12, 18, 19, -21, 0, 4, 7
        ));
        System.out.println(duplicateNums);
        int max = duplicateNums.stream().reduce(Integer::max).get();
        int min = duplicateNums.stream().reduce(Integer::min).get();
        AtomicBoolean flagMax = new AtomicBoolean(true);
        AtomicBoolean flagMin = new AtomicBoolean(true);
        System.out.println(duplicateNums.stream().filter(number -> {
            if (number == max) {
                if(flagMax.get()) {
                    flagMax.set(false);
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }).filter(number -> {
            if (number == min) {
                if(flagMin.get()) {
                    flagMin.set(false);
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }).toList());
    }
}
