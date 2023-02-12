package Festival;

import java.util.ArrayList;

public class View {
    public static void printListFest(ArrayList<Fest> fests) {
        for (Fest fest : fests) {
            System.out.println(fest);
        }
        System.out.println("------------------------------------------");
    }
}
