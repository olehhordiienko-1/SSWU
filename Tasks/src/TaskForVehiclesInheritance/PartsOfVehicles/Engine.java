package TaskForVehiclesInheritance.PartsOfVehicles;

public class Engine {
    private String model;
    private double volume;
    private int pistons;

    public Engine(String model, double volume, int pistons) {
        this.model = model;
        this.volume = volume;
        this.pistons = pistons;
    }

    public Engine(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPistons() {
        return pistons;
    }

    public void setPistons(int pistons) {
        this.pistons = pistons;
    }

    @Override
    public String toString() {
        return "Engine" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", pistons=" + pistons;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Engine)obj).model) &&
                this.volume == ((Engine)obj).volume &&
                this.pistons == ((Engine)obj).pistons;
    }
}