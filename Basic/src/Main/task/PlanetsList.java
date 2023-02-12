package Main.task;

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
}
