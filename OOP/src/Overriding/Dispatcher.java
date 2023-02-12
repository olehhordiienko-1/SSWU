package Overriding;

public class Dispatcher {
    public static void main(String[] args) {
        // String s = "Serg"; - literal
        String s = new String("Serg");
        System.out.println(s);
        Car c = new Car("BMW", 7000);
        System.out.println(c);
    }
}

class Car {
    String model;
    int price;
    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return this.model + " " + this.price;
    }

}