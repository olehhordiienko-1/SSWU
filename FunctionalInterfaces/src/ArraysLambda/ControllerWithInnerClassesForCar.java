package ArraysLambda;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class ControllerWithInnerClassesForCar {
    public static void testingSplitCarsToSlowestAndSpeediest(ArrayList<Car> cars, int limit) {
        System.out.println("---------------------------------");
        System.out.println("speediest cars: " + speediestCars.apply(cars, limit));
        System.out.println("slowest cars: " + slowestCars.apply(cars, limit));
    }

    public static BiFunction<ArrayList<Car>, Integer, ArrayList<Car>> speediestCars = (listCars, limit) -> {
        ArrayList<Car> result = new ArrayList<>();
        for(Car car : listCars) {
            if(car.getSpeed() >= limit) {
                result.add(car);
            }
        }
        return result;
    };

    public static BiFunction<ArrayList<Car>, Integer, ArrayList<Car>> slowestCars = (listCars, limit) -> {
        ArrayList<Car> result = new ArrayList<>();
        for(Car car : listCars) {
            if(car.getSpeed() < limit) {
                result.add(car);
            }
        }
        return result;
    };
}
