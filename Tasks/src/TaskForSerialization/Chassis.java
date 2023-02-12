package TaskForSerialization;

public class Chassis implements Comparable<Chassis>{
    private Wheel wheel;
    private int quantityWheels;

    public Chassis() {}

    public Chassis(Wheel wheel, int quantityWheels) {
        this.wheel = wheel;
        this.quantityWheels = quantityWheels;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getQuantityWheels() {
        return this.quantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    @Override
    public String toString() {
        return this.wheel + " " + this.quantityWheels;
    }

    @Override
    public boolean equals(Object obj) {
        return this.wheel.equals(((Chassis)obj).wheel) &&
                this.quantityWheels == ((Chassis) obj).quantityWheels;
    }

    @Override
    public int compareTo(Chassis chassis) {
        int result = this.wheel.compareTo(chassis.wheel);
        if(result == 0) {
            result = this.quantityWheels - chassis.quantityWheels;
        }
        return result;
    }
}
