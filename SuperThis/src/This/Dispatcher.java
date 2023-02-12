package This;

public class Dispatcher {
    public static void main(String[] args) {
        Car c = new Car("BMW", 7000);
        System.out.println(c.model + " " + c.price);
        c.move(); // Handler.move(this = c);

        Car c2 = new Car("AUDI", 7000);
        c2.move(); // Handler.move(this = c2);

    }
}

class Car {
    String model;
    int price;

    Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    void move() {
        System.out.println("Handler " + this.model + " is driving");
    }

//    static void display() {
//        System.out.println(this.model);
//    }
}
