package Equals;

public class Dispatcher {
    public static void main(String[] args) {
        String s1 = new String("Serg");
        String s2 = new String("Serg");
        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2)); // true

        Car c1 = new Car("BMW", "Black", 7000, 260);
        Car c2 = new Car("BMW", "Black", 7000, 260);
        System.out.println(c1 == c2);   // false
        System.out.println(c1.equals(c2)); // true?? - false
    }
}

class Car {
    String model;
    String color;
    int price;
    int speed;

    Car(String model, String color, int price, int speed) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    public boolean equals(Object o) {
        return this.speed == ((Car)o).speed &&
                this.price == ((Car)o).price &&
                this.color.equals(((Car)o).color) &&
                this.model.equals(((Car)o).model);
    }
}