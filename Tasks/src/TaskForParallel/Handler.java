package TaskForParallel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Handler {
    public static int i = 10;
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Eu turpis egestas pretium aenean pharetra magna ac placerat vestibulum.";

        Map<Integer, Integer> sentences = new HashMap<>();
        AtomicInteger counter = new AtomicInteger(0);
        AtomicInteger position = new AtomicInteger(0);

        Arrays.stream(text.toLowerCase().chars().toArray()).forEach(c -> {
            if (c == '.') {
                sentences.put(position.getAndIncrement(), counter.getAndSet(0));
            } else if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    counter.getAndDecrement();
                } else {
                    counter.getAndIncrement();
                }
            }
        });
        System.out.println(sentences);
    }

    public static void getUp(int i) {

    }
}
