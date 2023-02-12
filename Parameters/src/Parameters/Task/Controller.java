package Parameters.Task;

public class Controller {
    static double doSpecifiedOperationWithTwoValues(String operation, double firstValue, double secondValue) {
        switch (operation) {
            case "div" -> firstValue = firstValue / secondValue;
            case "log10" -> firstValue = Math.log10(firstValue + secondValue);
            case "log" -> firstValue = Math.log(firstValue + secondValue);
            case "pow" -> firstValue = Math.pow(firstValue, secondValue);
        }
//        System.out.println(firstValue);
        return firstValue;
    }

    static void multiplySpecifiedFieldByValue(String field, Car car, double multiplier) {
        switch (field) {
            case "price" -> car.priceCar *= multiplier;
            case "weight" -> car.weightCar *= multiplier;
            case "speed" -> car.speedCar *= multiplier;
            default -> System.out.println("Incorrect field.");
        }
    }
}
