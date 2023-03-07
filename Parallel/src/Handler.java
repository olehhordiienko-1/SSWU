import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Handler {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            Integer t = (int)(Math.random() * 1000000);
            li.add(t);
        }

        Stream<Integer> si1 = li.stream();
        Stream<Integer> si2 = li.parallelStream();

        long start1 = System.currentTimeMillis();
        si1.sorted();
        long end1 = System.currentTimeMillis();
        System.out.println((end1 - start1));

        long start2 = System.currentTimeMillis();
        si2.sorted();
        long end2 = System.currentTimeMillis();
        System.out.println((end2 - start2));

/*        Stream<Integer> si1 = li.stream();
        long start1 = System.currentTimeMillis();
        long count1 = si1.filter(number -> number % 2 == 0).count();
        long end1 = System.currentTimeMillis();
        System.out.println(count1 + " " + (end1 - start1));

        Stream<Integer> si2 = li.parallelStream();
        long start2 = System.currentTimeMillis();
        long count2 = si2.filter(number -> number % 2 == 0).count();
        long end2 = System.currentTimeMillis();
        System.out.println(count2 + " " + (end2 - start2)); */
    }
}
