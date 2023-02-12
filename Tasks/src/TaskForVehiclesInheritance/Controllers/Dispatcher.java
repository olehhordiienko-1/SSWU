package TaskForVehiclesInheritance.Controllers;

import TaskForVehiclesInheritance.MainClasses.Car;
import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(List.of(
                new Car("BMW", new Owner("Serg", "Ishcheryakov", 35), 270, 50, 60, false, "Black", new Engine(), new Wheel[]{}),
                new Car("Mercedes", new Owner("Serg", "Ishcheryakov", 35), 295, 89, 1200, true, "Red", new Engine(), new Wheel[]{}),
                new Car("Toyota", new Owner("Oleh", "Hordiienko", 20), 340, 120, 2000, true, "Gold", new Engine(), new Wheel[]{}),
                new Car("Lexus", new Owner("Yaroslav", "Bykov", 24), 250, 95, 999, true, "Grey", new Engine(), new Wheel[]{})));
        Owner owner = new Owner("Serg", "Ishcheryakov", 35);

        boolean firstVariantHasCarsSpecifyOwner = Controller.checkCarsInGarageForSpecifyOwnerByContains(cars, owner);
        boolean secondVariantHasCarsSpecifyOwner = Controller.checkCarsInGarageForSpecifyOwner(cars, owner);

        View.printIsInGarageCarForSpecifyOwner(firstVariantHasCarsSpecifyOwner, owner);
        System.out.println("-----------------------");
        View.printIsInGarageCarForSpecifyOwner(secondVariantHasCarsSpecifyOwner, owner);
    }
}
