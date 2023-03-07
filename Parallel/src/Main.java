import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Serg"); ls.add("Max"); ls.add("Bohdan"); ls.add("Vlad");
        ls.add("Andrew"); ls.add("Peter"); ls.add("Mark"); ls.add("Ann");
        ls.add("Mary"); ls.add("Anatol"); ls.add("Ron"); ls.add("Lucy");
        ls.add("Mo"); ls.add("Alexander"); ls.add("Volodymyr"); ls.add("Ab");

        int[] count = new int[4]; // 2 > n < 7
//        int length;
        ls.parallelStream().forEach(s -> {
                int length = s.length();
                if(length > 2 && length < 7) {
                    count[length - 3]++;
                }
        });

        System.out.println(Arrays.toString(count));
        /*int[] count = new int[4]; // 2 > n < 7
        int length;
        for(String temp : ls) {
            length = temp.length();
            if(length > 2 && length < 7) {
                count[length - 3]++;
            }
        }
        System.out.println(Arrays.toString(count));*/
    }

}
