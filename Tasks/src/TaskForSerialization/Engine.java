package TaskForSerialization;

public class Engine implements Comparable<Engine>{
    private String type;
    private double power;

    public Engine() {}

    public Engine(String type, double power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.type + " " + this.power;
    }

    @Override
    public boolean equals(Object obj) {
        return this.type.equals(((Engine) obj).type) &&
                (Double.compare(this.power, ((Engine) obj).power) == 0);
    }

    @Override
    public int compareTo(Engine engine) {
        int result = this.type.compareTo(engine.type);
        if (result == 0) {
            result = Double.compare(this.power, engine.power);
        }
        return result;
    }
}
