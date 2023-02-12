package Collections.Hashmap;

import java.util.HashMap;

public class Handler {
    public static void main(String[] args) {
        HashMap<Car, String> hmcs = new HashMap<>();
        hmcs.put(new Car("BMW", 1, 7000), "Max");
        hmcs.put(new Car("Audi", 2, 5000), "Mark");
        hmcs.put(new Car("Ford", 3, 6000), "Ann");
        hmcs.put(new Car("Opel", 4, 8000), "Lucy");

        System.out.println(hmcs.get(new Car("Ford", 3, 0)));
    }
}

class Car {
    String model;
    int id;
    int price;
    public Car(String model, int id, int price) {
        this.model = model;
        this.id = id;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Car) obj).model) &&
                this.id == ((Car) obj).id;
    }

    public int hashCode() {
        return 17 * this.id + 19 * model.length();
    }
}
