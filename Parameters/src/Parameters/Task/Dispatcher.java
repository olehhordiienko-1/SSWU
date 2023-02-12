package Parameters.Task;

public class Dispatcher {
    public static void main(String[] args) {
        double firstOperand = 11.4;
        double secondOperand = 5.12;
        System.out.println("before value of firstOperand: " + firstOperand);
        firstOperand = Controller.doSpecifiedOperationWithTwoValues("log", firstOperand, secondOperand);
        System.out.println("after value of firstOperand: " + firstOperand);

        Car car = new Car(4999.999, 980.65, 183.58);
        System.out.println("before car price: " + car.priceCar);
        Controller.multiplySpecifiedFieldByValue("price", car, 2.2);
        System.out.println("after car price: " + car.priceCar);
    }
}
