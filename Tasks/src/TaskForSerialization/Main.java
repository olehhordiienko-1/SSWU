package TaskForSerialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File filePlanes = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                "SigmaSoftware/Projects/src/Sigma/Software/TaskForSerialization/PLANES");

        File fileShips = new File("/Users/olehhordiienko/Oleh/JavaCampSigma/" +
                "SigmaSoftware/Projects/src/Sigma/Software/TaskForSerialization/SHIPS");

        ArrayList<Plane> planes = new ArrayList<>(List.of(
                new Plane(310, 2004, new Engine("Boeing new century engine", 400),
                        "Boeing-747", new Chassis(new Wheel(700, 2.5), 6), 900),
                new Plane(360, 2021, new Engine("GE9X", 600),
                        "Boeing-777X", new Chassis(new Wheel(3200, 3), 12), 2000),
                new Plane(230, 1953, new Engine("MX29 Banshee", 320),
                        "Boeing B-29 SuperFortress", new Chassis(new Wheel(1200, 2.7), 18), 3000),
                new Plane(350, 2017, new Engine("747 LCF Boeing", 700),
                        "Boeing 747 DreamLifter", new Chassis(new Wheel(1600, 3), 14), 1700))
        );
        System.out.println("\n-------Planes before sorting and serialization-------");
        for (Plane plane : planes) {
            System.out.println(plane);
        }
        Controller.serializePlanesList(planes, filePlanes);
        Controller.deserializePlanesList(filePlanes);

        ArrayList<Ship> ships = new ArrayList<>(List.of(
                new Ship(220, 2007, new Engine("Ship engine", 400),
                        1.5, 9.4, new Boat(14, "Metal")),
                new Ship(300, 2022, new Engine("New Century engine FX3090", 700),
                        6, 7.4, new Boat(12, "Metal")),
                new Ship(260, 2013, new Engine("Powerfully Andromeda", 900),
                        4.3, 6.1, new Boat(6, "Metal-Titan")),
                new Ship(160, 1943, new Engine("None", 100),
                        3.9, 4.2, new Boat(5, "Wooden"))
        ));
        System.out.println("\n-------Ships before sorting and serialization-------");
        for (Ship ship : ships) {
            System.out.println(ship);
        }
        Controller.serializeShipsList(ships, fileShips);
        Controller.deserializeShipsList(fileShips);
    }
}
