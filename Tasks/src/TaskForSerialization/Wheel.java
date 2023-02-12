package TaskForSerialization;

public class Wheel implements Comparable<Wheel>{
    private double load;
    private double diameter;

    public Wheel() {
    }

    public Wheel(double load, double diameter) {
        this.load = load;
        this.diameter = diameter;
    }

    public double getLoad() {
        return this.load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return this.diameter + " " + this.load;
    }

    @Override
    public boolean equals(Object obj) {
        return (Double.compare(this.load, ((Wheel) obj).load) == 0) &&
                (Double.compare(this.diameter, ((Wheel) obj).diameter) == 0);
    }


    @Override
    public int compareTo(Wheel wheel) {
        int result = Double.compare(this.load, wheel.load);
        if(result == 0) {
            result = Double.compare(this.diameter, wheel.diameter);
        }
        return result;
    }
}