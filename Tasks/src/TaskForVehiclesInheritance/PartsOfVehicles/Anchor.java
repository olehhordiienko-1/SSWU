package TaskForVehiclesInheritance.PartsOfVehicles;

public class Anchor {
    private String model;
    private double length;
    private double width;

    public Anchor(String model, double length, double width) {
        this.model = model;
        this.length = length;
        this.width = width;
    }

    public Anchor(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Anchor" +
                "model='" + model + '\'' +
                ", length=" + length +
                ", width=" + width;
    }

    @Override
    public boolean equals(Object obj) {
        return this.model.equals(((Anchor)obj).model) &&
                this.length == ((Anchor)obj).length &&
                this.width== ((Anchor)obj).width;
    }
}