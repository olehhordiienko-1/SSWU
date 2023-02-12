package Comparator;

import java.util.*;

public class Dispatcher {
    public static void main(String[] args) {
        String[] str = {"Serg", "Ann", "Max", "Vlad", "Mary"};
//        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));

        Car[] cars = {new Car("BMW", "Green", 7000, 240),
                new Car("Audi", "White", 8000, 220),
                new Car("Ford", "Black", 6000, 230),
                new Car("Opel", "Blue", 9000, 250)
        };


        Car car = new Car();

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, new Car().new ComparatorByPrice());
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, new Car.ComparatorBySpeed());
        Arrays.sort(cars, new Car.ComparatorBySpeed());

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Car) o1).color.compareTo(((Car) o2).color);
            }
        });

        System.out.println(Arrays.toString(cars));
    }
}

class Car implements Comparable {
    String model;
    String color;
    int price;
    int speed;

    Car(String model, String color, int price, int speed) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    Car() {
    }

    public String toString() {
        return this.model + " " +
                this.color + " " +
                this.speed + " " +
                this.price;
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.price - ((Handler) o).price;
//    }

//    @Override
//    public int compareTo(Object o) {
//        return ((Handler) o).speed - this.speed;
//    }

//    @Override
//    public int compareTo(Object o) {
//        return this.model.compareTo(((Handler) o).model);
//    }


    @Override
    public int compareTo(Object o) {
        // model -> price -> speed -> color
        int result = this.model.compareTo(((Car) o).model);
        if (result != 0) {
            return result;
        } else {
            result = this.price - ((Car) o).price;
            if (result != 0) {
                return result;
            } else {
                result = ((Car) o).speed - this.speed;
                if (result != 0) {
                    return result;
                } else {
                    return this.color.compareTo(((Car) o).color);
                }
            }
        }
    }

    class ComparatorByPrice implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Car) o1).price - ((Car) o2).price;
        }
    }

    static class ComparatorBySpeed implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Car) o2).speed - ((Car) o1).speed;
        }
    }

    class ComparatorByModel implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Car) o1).model.compareTo(((Car) o2).model);
        }
    }

    class ComparatorByColor implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Car) o1).color.compareTo(((Car) o2).color);
        }
    }
}