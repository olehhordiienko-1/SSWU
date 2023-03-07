import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        List<Family> firstFam = new ArrayList<>(List.of(
                new Family("aa", "Kalush", 3),
                new Family("ab", "Kosiv", 4),
                new Family("ac", "Galych", 2),
                new Family("ad", "Kolomiya", 1),
                new Family("ae", "Kalush", 4),
                new Family("af", "Galych", 3),
                new Family("ag", "Kolomiya", 3),
                new Family("aj", "Kalush", 2),
                new Family("ak", "Kosiv", 1),
                new Family("ai", "Kalush", 4),
                new Family("ay", "Kosiv", 3)
        ));     // 30

        Airplane firstPlane = new Airplane(firstFam, 101); // 30

        List<Family> secFam = new ArrayList<>(List.of(
                new Family("ba", "Kalush", 2),
                new Family("bb", "Kosiv", 3),
                new Family("bc", "Galych", 3),
                new Family("bd", "Kolomiya", 4),
                new Family("be", "Kalush", 1),
                new Family("bf", "Galych", 2),
                new Family("bg", "Kolomiya", 4),
                new Family("bj", "Kalush", 3),
                new Family("bk", "Kosiv", 2),
                new Family("bi", "Kalush", 3),
                new Family("by", "Kosiv", 1)
        ));     // 28

        Airplane secPlane = new Airplane(secFam, 102); // 28

        List<Bus> buses = new ArrayList<>(List.of(
                new Bus(6, "Kalush"),
                new Bus(8, "Kolomiya"),
                new Bus(6, "Kosiv"),
                new Bus(7, "Galych"),
                new Bus(6, "Kosiv"),
                new Bus(7, "Kalush"),
                new Bus(6, "Kosiv"),
                new Bus(8, "Kolomiya"),
                new Bus(8, "Galych")
        ));


        List<Airplane> airplanes = new ArrayList<>(List.of(
           firstPlane, secPlane
        ));
        Controller.simulateAirport(buses, airplanes);

    }
}
