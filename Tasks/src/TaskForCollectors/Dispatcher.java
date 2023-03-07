package TaskForCollectors;

import java.util.*;
import java.util.stream.Collectors;

public class Dispatcher {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                -10, 4, 3, 2, 1, 9, 3, 8, 14
        ));

        // task 1
        double average = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(numbers.stream().filter(number -> number > average).toList());

        // task 2
        int max = numbers.stream().max(Integer::compareTo).get();
        int min = numbers.stream().min(Integer::compareTo).get();

        System.out.println(numbers.stream().distinct().map(number -> {
            if(number == max) {
                return min;
            }

            if (number == min) {
                return max;
            }
            return number;
        }).toList());

        // task 3
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Eu turpis egestas pretium aenean pharetra magna ac placerat vestibulum.";

        int counter = 0;
        int position = 0;
        List<Sentence> sentences = new ArrayList<>();
        char[] array = text.toLowerCase().toCharArray();
        for(char c : array) {
            if(c == '.') {
                sentences.add(new Sentence(counter, position));
                position++;
                counter = 0;
                continue;
            }

            if(Character.isLetter(c)) {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    counter--;
                } else {
                    counter++;
                }
            }
        }
        Map<Integer, List<Sentence>> result = sentences.stream().collect(Collectors.groupingBy(Sentence::getPosition));
        System.out.println(result);
    }
}
