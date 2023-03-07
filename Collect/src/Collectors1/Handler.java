package Collectors1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Handler {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Mary", "Lucy", "Ann", "Vlad",
                "Max", "Paul", "Mo", "Pete"
        ));
        Stream<String> ss = names.stream();

//      toList(), toSet(), toCollections()

//        List<String> startM = ss.filter(s -> s.startsWith("M")).toList();
//        System.out.println(startM);

//        Collector<String, ?, TreeSet<String>> cstss = ;
//        TreeSet<String> tss = ss.map(s -> s.toUpperCase()).
//                collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(tss);

//        counting(), averagingInt(), summingInt(), joining(), maxBy()
//        Collector<String, ?, Double> csd = Collectors.averagingDouble(String::length);
//        Double average = ss.collect(csd);
//        System.out.println(average);

//        Collector<String, ?, Integer> csi = Collectors.summingInt(String::length);
//        System.out.println(ss.collect(csi));

//        String result = ss.collect(Collectors.joining(" "));
//        System.out.println(result);

//        partitioningBy(), groupingBy()    COMPOSED COLLECTORS
//        Collector<String, ?, Map<Boolean, List<String>>> csm = Collectors.partitioningBy(s -> s.length() == 4);
//        Map<Boolean, List<String>> mbls = ss.collect(csm);
//        System.out.println(mbls);

//        Collector<String, ?, Map<Boolean, Long>> csmbl = Collectors.partitioningBy(s -> s.length() == 4, Collectors.counting());
//        System.out.println(ss.collect(csmbl));

//        Collector<String, ?, Map<Integer, List<String>>> csm = Collectors.groupingBy(String::length);
//
//        System.out.println(ss.collect(csm));
        Collector<String, ?, Map<Integer, Set<String>>> csm = Collectors.groupingBy(String::length, Collectors.toCollection(TreeSet::new));
        System.out.println(ss.collect(csm));

    }
}
