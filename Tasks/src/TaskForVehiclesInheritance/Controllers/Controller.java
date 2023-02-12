package TaskForVehiclesInheritance.Controllers;

import TaskForVehiclesInheritance.MainClasses.Car;
import TaskForVehiclesInheritance.MainClasses.Owner;
import TaskForVehiclesInheritance.PartsOfVehicles.Engine;
import TaskForVehiclesInheritance.PartsOfVehicles.Wheel;

import java.util.ArrayList;

public class Controller {
    public static boolean checkCarsInGarageForSpecifyOwner(ArrayList<Car> cars, Owner owner) {
        for(Car car : cars) {
            if(car.getOwner().equals(owner)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCarsInGarageForSpecifyOwnerByContains(ArrayList<Car> cars, Owner owner) {
        return cars.contains(new Car("", owner, 0, 0, 0, false, "", new Engine(), new Wheel[]{}));
    }
}
