package TaskForVehiclesInheritance.PartsOfVehicles;

public class Extinguisher {
    private double volume;
    private String model;

    public Extinguisher(double volume, String model) {
        this.volume = volume;
        this.model = model;
    }

    public Extinguisher(){}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Extinguisher" +
                "volume=" + volume +
                ", model='" + model;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Extinguisher)obj).model) &&
                this.volume == ((Extinguisher)obj).volume;
    }
}