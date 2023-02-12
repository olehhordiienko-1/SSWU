package TaskForGenerics;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        Animal[] arAnimals = {
                new Animal(13, 50, 30, 120),
                new Animal(3, 13, 16, 20),
                new Animal(30, 70, 200, 90),
                new Animal(15, 40, 60, 10),
                new Dog(9, 29, 45, 20, "Brown", true, false, true),
                new Animal(25, 60, 40, 140),
                new Cat(15, 53, 80, 113, "British", "Sleek", 12),
                new Cat(4, 40, 34, 111, "Scottish", "Fluffy", 9)
        };

        ArrayList<Animal> liAnimals = new ArrayList<>(List.of(
                new Animal(13, 50, 30, 120),
                new Animal(4, 14, 16, 20),
                new Animal(13, 50, 30, 120),
                new Dog(30, 70, 200, 90, "Brown", false, false, true),
                new Dog(9, 29, 45, 20, "Brown", true, false, true),
                new Cat(15, 53, 80, 113, "British", "Sleek", 12),
                new Animal(31, 73, 200, 90),
                new Animal(15, 40, 60, 10),
                new Animal(25, 60, 40, 140)
        ));

        Cat[] arCats = {
                new Cat(15, 53, 80, 113, "British", "Sleek", 12),
                new Cat(4, 40, 34, 111, "Scottish", "Fluffy", 9),
                new Cat(5, 28, 15, 80, "Yard", "Fluffy-Sleek", 11),
                new Cat(13, 50, 30, 120, "British", "Fluffy", 12),
                new Cat(6, 38, 25, 70, "Yard-Scottish", "Sleek", 13)
        };

        List<Cat> liCats = new ArrayList<>(List.of(
                new Cat(13, 50, 30, 120, "British", "Fluffy", 12),
                new Cat(3, 40, 34, 111, "Scottish", "Sleek", 9),
                new Cat(5, 28, 15, 80, "Yard", "Fluffy-Sleek", 11),
                new Cat(13, 50, 30, 120, "British", "Fluffy", 12),
                new Cat(5, 28, 15, 80, "Yard", "Fluffy-Sleek", 11)
        ));

        List<Dog> liDogs = new ArrayList<>(List.of(
                new Dog(30, 70, 200, 90, "Brown", false, false, true),
                new Dog(9, 29, 45, 20, "Brown", true, false, true)
        ));

        System.out.println(Controller.findCommonElementsInContainers(arAnimals, liAnimals));
        System.out.println(Controller.findCommonElementsInContainersWithoutInheritance(arAnimals, liAnimals));

        System.out.println(Controller.findMissingElementsInContainers(arAnimals, liAnimals));
        System.out.println(Controller.findMissingElementsInContainersWithoutInheritance(arAnimals, liAnimals));

        System.out.println(Controller.findCommonElementsInContainersWithoutInheritance(arCats, liAnimals));
//        System.out.println(Controller.findMissingElementsInContainersWithoutInheritance(arAnimals, liCats));  !!!
//        System.out.println(Controller.findMissingElementsInContainersWithoutInheritance(arCats, liDogs));     !!!

    }
}
