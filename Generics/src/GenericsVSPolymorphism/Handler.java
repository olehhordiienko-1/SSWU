package GenericsVSPolymorphism;

import java.util.*;

public class Handler {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
//        arraysNoChange(dogs);
//        arraysNoChange(cats);

//        arraysChange(dogs);
        List<Animal> la8 = new ArrayList();         // Java SE8
        List<Animal> la7 = new ArrayList<>();       // Java SE7 +++++++++
        List<Animal> la6 = new ArrayList<Animal>(); // Java SE6 !!
//        List<Animal> la = new ArrayList<Dog>();     //

        la7.add(new Dog());
        la7.add(new Dog());
        collectionsNoChange(la7);
        collectionsChange(la7);

        List<Dog> dogs1 = new ArrayList<>();
        dogs1.add(new Dog());
        dogs1.add(new Dog());
        collectionsNoChange(dogs1);
        collectionsChange(la7);
    }
    static void arraysNoChange(Animal[] arr){
        System.out.println(arr.length);
    }

    static void arraysChange(Animal[] arr){
        arr[0] = new Cat();
    }

    static void collectionsNoChange(List<? extends Animal> la){
        System.out.println(la.size());
    }

    static void collectionsChange(List<? super Animal> la){
        la.add(new Cat());
    }
}

class Animal{ }

class Dog extends Animal{ }

class Cat extends Animal{ }