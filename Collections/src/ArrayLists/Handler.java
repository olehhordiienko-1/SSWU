package ArrayLists;

import java.util.ArrayList;

public class Handler {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // System.out.println(list.size());
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(12);
        System.out.println(list);
        list.add(1, 8);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf(12));
    }
}
