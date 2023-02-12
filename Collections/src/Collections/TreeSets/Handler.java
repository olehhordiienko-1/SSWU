package Collections.TreeSets;

import java.util.*;

public class  Handler {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Serg");
        ts.add("Ann");
        ts.add("Max");
        ts.add("Mary");

        System.out.println(ts);
        ts.add("Max");
        ts.add("Paul");
        System.out.println(ts);

        TreeSet<Car> tsc = new TreeSet<Car>();
        tsc.add(new Car("BMW", 7500));
        tsc.add(new Car("Audi", 9000));
        tsc.add(new Car("Ford", 8000));
        tsc.add(new Car("Lexus", 5000));
        System.out.println(tsc);
        System.out.println(tsc.floor(new Car("", 7500)));
        System.out.println(tsc.tailSet(new Car("", 7500), true));
        System.out.println(tsc.headSet(new Car("", 7500), false));
    }
}

class Car implements Comparable<Car>{
    String model;
    int price;
    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public String toString(){
        return this.model + " " + this.price;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}
