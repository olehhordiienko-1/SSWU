package TaskForVehiclesInheritance.PartsOfVehicles;

import java.util.Arrays;

public class Apron {
    private Rocket[] rockets;
    private String model;

    public Apron(Rocket[] rockets, String model) {
        this.rockets = rockets;
        this.model = model;
    }

    public Apron(){}

    public Rocket[] getRockets() {
        return rockets;
    }

    public void setRockets(Rocket[] rockets) {
        this.rockets = rockets;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Apron{" +
                "rockets=" + Arrays.toString(rockets) +
                ", model='" + model;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Apron)obj).model) &&
                Arrays.equals(this.rockets, ((Apron) obj).rockets);
    }
}
