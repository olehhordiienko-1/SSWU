package TaskForSerialization;

public class Vehicle implements Comparable<Vehicle> {
    private int speed;
    private int manufactureYear;
    private Engine engine;

    public Vehicle() {}

    public Vehicle(int speed, int manufactureYear, Engine engine) {
        this.speed = speed;
        this.manufactureYear = manufactureYear;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return this.engine + " " +
                this.manufactureYear + " " + this.speed;
    }

    @Override
    public boolean equals(Object obj) {
        return this.engine.equals(((Vehicle) obj).engine) &&
                this.speed == ((Vehicle) obj).speed &&
                this.manufactureYear == ((Vehicle) obj).manufactureYear;
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        int result = this.manufactureYear - vehicle.manufactureYear;
        if(result != 0) {
            return result;
        } else {
            result = this.speed - vehicle.speed;
            if(result != 0) {
                return result;
            } else {
                return this.engine.compareTo(vehicle.engine);
            }
        }
    }
}
