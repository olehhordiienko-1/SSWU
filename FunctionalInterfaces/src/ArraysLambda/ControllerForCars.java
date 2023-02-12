package ArraysLambda;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ControllerForCars {
    public static void getCarsWithSpeedMoreThanSpecifiedValue(ArrayList<Car> cars, int speed) {
        BiFunction<ArrayList<Car>, Integer, ArrayList<Car>> speediestCars = (listCars, limit) -> {
            ArrayList<Car> result = new ArrayList<>();
            for(Car car : listCars) {
                if(car.getSpeed() >= limit) {
                    result.add(car);
                }
            }
            return result;
        };

        BiFunction<ArrayList<Car>, Integer, ArrayList<Car>> slowestCars = (listCars, limit) -> {
            ArrayList<Car> result = new ArrayList<>();
            for(Car car : listCars) {
                if(car.getSpeed() < limit) {
                    result.add(car);
                }
            }
            return result;
        };

        System.out.println(slowestCars.apply(cars, speed));
        System.out.println(speediestCars.apply(cars, speed));
    }
}
