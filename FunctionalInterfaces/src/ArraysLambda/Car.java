package ArraysLambda;

public class Car {
    private String model;
    private String owner;
    private int speed;

    public Car() {
    }

    public Car(String model, String owner, int speed) {
        this.model = model;
        this.owner = owner;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model + " " +
                owner + " " +
                speed;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Car) obj).model) &&
                this.owner.equals(((Car) obj).owner) &&
                this.speed == ((Car) obj).speed;
    }
}
