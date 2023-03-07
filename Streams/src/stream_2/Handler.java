package stream_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Handler {
    public static void main(String[] args) {
        Optional<Integer> opt1 = Optional.ofNullable(null);
        Integer i1 = null;
//        i1.byteValue(); // excep
//        System.out.println(opt1.orElse(20));


        Optional<String> opt2 = Optional.of("Serg");
        Optional<String> opt3 = opt2.filter(s -> s.length() > 4);
//        System.out.println(opt3);

        List<String> ls = new ArrayList<>(List.of(
                "Serg", "Ann", "Lucy", "Vlad",
                "Mary", "Max", "Andrew", "Mark"
        ));

        System.out.println(ls.stream().min(String::compareTo).get());
        ;
        System.out.println(ls.stream().sorted().findFirst().get());
        System.out.println(ls.stream().findAny().get());

        List<Integer> li = new ArrayList<>();
        li.add(5); li.add(8); li.add(2); li.add(6); li.add(4); li.add(9);
        System.out.println(li.stream().reduce((s1, s2) -> s1 += s2));
        System.out.println(li.stream().reduce(0, (s1, s2) -> s1 += s2));
    }
}

// max min findAny findFirst reduce => Optional - fix it maybe ???
// NullPointerException