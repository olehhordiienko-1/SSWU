package ArraysLambda;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        Integer[] array = {-7, 8, 6, -12, 9, 3, -4, 5, 3, 0};
        ControllerForNumbers.splitArrayToPositiveAndNegative(array);
        System.out.println("------------------");
        ControllerForNumbers.splitArrayToEvenAndOdd(array);

        ArrayList<Car> garage = new ArrayList<>(List.of(
                new Car("BMW", "Oleh", 270),
                new Car("Opel", "Serhii", 240),
                new Car("Mercedes", "Ivan", 275),
                new Car("Subaru", "Maksim", 280),
                new Car("Toyota", "Yurii", 340),
                new Car("Chevrolet", "Arseniy", 295),
                new Car("Dodge", "Dmytro", 265)
        ));
        System.out.println("------------------");
        ControllerForCars.getCarsWithSpeedMoreThanSpecifiedValue(garage, 279);

        ControllerWithInnerClasses.testingFunctionalInterfacesWithLambda(array);
        ControllerWithInnerClassesForCar.testingSplitCarsToSlowestAndSpeediest(garage, 279);
    }
}
