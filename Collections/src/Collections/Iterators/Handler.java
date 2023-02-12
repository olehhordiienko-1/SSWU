package Collections.Iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class Handler {
    public static void main(String[] args) {
        ArrayList<Car> alc = new ArrayList<>();
        alc.add(new Car(7000));
        alc.add(new Car(5000));
        alc.add(new Car(6000));

        // < 6500 -> 10000
        Car temp;
        ListIterator<Car> it = alc.listIterator();
        while (it.hasNext()) {
            temp = it.next();
            if(temp.price < 6500) {
                it.set(new Car(10000));
            }
        }
        System.out.println(alc);
    }
}

class Car {
    int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + this.price;
    }
}
