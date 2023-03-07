import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Handler {
    public static int rand;

    public static void main(String[] args) {
        Collection<String> als = new ArrayList<>();
        als.add("Serg");
        als.add("Ann");
        als.add("Max");
        als.add("Vlad");
        Stream<String> ss1 = als.stream();
        Stream<String> ss2 = als.parallelStream();

        // first method - empty Stream
        Stream<String> ss3 = Stream.empty();
        System.out.println(ss3.count());
        // second method - with var-args !!!
        Stream<String> ss4 = Stream.of("Kyiv", "Odessa", "Kharkiv", "Lviv", "Poltava");
        // third method - arrays()
        ss4.map(s -> s.toUpperCase() + "UA").sorted().forEach(s -> System.out.print(s + ' '));
        System.out.println();
        Stream<String> ss5 = Arrays.stream(new String[]{"Java", "Python", ".NET", "C++"});
        // fourth method
        Stream<String> ss6 = Stream.generate(() ->
                new Double(Math.random()).toString()
        );
        // limit to fourth method (generate)
//        Stream<String> ss7 = ss6.limit(10);
//        ss7.forEach(s -> System.out.println(s));
        ss6.limit(10).forEach(s -> System.out.print(s + ' '));
        System.out.println("SS6");

        ss6 = Stream.generate(() ->
                new Double(Math.random()).toString()
        );
        ss6.limit(10).sorted().forEach(s -> System.out.print(s + ' '));
        System.out.println("SS7");

        // STREAM CONCAT !!!
//        Stream<String> ssAddition = Stream.of("Lviv");
//        Stream<String> ss8 = Stream.concat(ss4, ssAddition);
//        ss8.distinct().skip(1).forEach(s -> System.out.print(s + ' '));
//        System.out.println("SS8");
//        ss8.filter(s -> s.length() < 6).forEach(s -> System.out.print(s + ' '));
        // STREAM ITERATE
        Stream<String> ss9 = Stream.iterate("Serg", s -> {
            rand = (int) (Math.random() * 20);
            if (rand % 2 == 0) {
                return s.toUpperCase();
            } else {
                return s.toLowerCase();
            }
        });

//        ss9.limit(10).forEach(s -> System.out.print(s + ' '));

        Stream<Car> sc = Stream.of(new Car(7000), new Car(5000), new Car(8000));
        sc.peek(car -> car.price += 500).forEach(s -> System.out.println(s.price));

        List<Integer> li =  sc.map(car -> car.price += 500).collect(Collectors.toList());
    }
}

class Car {
    int price;
    Car(int price) {
        this.price = price;
    }
}
