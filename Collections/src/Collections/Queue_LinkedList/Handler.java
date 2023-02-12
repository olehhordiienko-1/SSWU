package Collections.Queue_LinkedList;

import java.util.*;

public class Handler {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqi = new PriorityQueue<>();
        pqi.offer(5);
        pqi.offer(2);
        pqi.offer(7);
        pqi.offer(1);
        pqi.add(6);
        pqi.add(3);
        System.out.println(pqi);

        int length = pqi.size();
        for(int i = 0; i < length; i++) {
            System.out.print(pqi.poll() + " ");
        }

        LinkedList<Integer> lli = new LinkedList<>();
        lli.offer(5);lli.offer(2);lli.offer(7);lli.offer(1);lli.offer(6);lli.offer(3);
        lli.add(2, 4);


    }
}

class Car {
    int price;
    Car(int price) {
        this.price = price;
    }
}
