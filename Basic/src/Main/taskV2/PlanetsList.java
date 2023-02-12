package Main.taskV2;

import java.util.ArrayList;

public class PlanetsList {
    ArrayList<String> planets;
    String typeOfList;

    public PlanetsList() {
        typeOfList = "PLANETS";

        planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptune");
    }

    public void printList(String[] array) {
        for (String s : array) {
            switch (s) {
                case "1" -> System.out.println(planets.get(0));
                case "2" -> System.out.println(planets.get(1));
                case "3" -> System.out.println(planets.get(2));
                case "4" -> System.out.println(planets.get(3));
                case "5" -> System.out.println(planets.get(4));
                case "6" -> System.out.println(planets.get(5));
                case "7" -> System.out.println(planets.get(6));
                case "8" -> System.out.println(planets.get(7));
            }
        }
    }
}
