package TaskForStreamsOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dispatcher {
    public static void main(String[] args) throws Exception {
        // task 1
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Eu turpis egestas pretium aenean pharetra magna ac placerat vestibulum.";

        String parsedText = Arrays.stream(text.split(" ")).map(word -> word.
                substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
        System.out.println(parsedText);

        // task 2
        Arrays.stream(text.split("\\.")).
                map(sentence -> sentence.trim().split(" ").length).sorted().
                forEach(count -> System.out.print(count + " "));
        System.out.println();

        // task 3 - 1 case, here we use 3 collections (pos, neg, num)
        List<Integer> numbers = new ArrayList<>(List.of(
                1, 5, -3, 4, 6, -8, 9, 10, -13
        ));

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        numbers.stream().map(number -> number > -1? pos.add(number) : neg.add(number)).collect(Collectors.toList());
        System.out.println(pos);
        System.out.println(neg);

        // task 3 - case using only stream collector
        System.out.println(numbers.stream().collect(Collectors.partitioningBy(number -> number > -1)));

        // task 3 - case 2, but we use only 2 collections.
        List<Integer> negative = numbers.stream().filter(number -> number < -1).toList();
        System.out.println(negative);

        numbers.removeAll(negative);
        System.out.println(numbers);
    }
}
