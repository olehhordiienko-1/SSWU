package TaskForVehiclesInheritance.PartsOfVehicles;

public class Wing {
    private String modelWing;
    private double length;
    private double width;

    public Wing(String modelWing, double length, double width) {
        this.modelWing = modelWing;
        this.length = length;
        this.width = width;
    }

    public Wing() {}

    public String getModelWing() {
        return modelWing;
    }

    public void setModelWing(String modelWing) {
        this.modelWing = modelWing;
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
        return "Wing" +
                "modelWing='" + modelWing + '\'' +
                ", length=" + length +
                ", width=" + width;
    }

    @Override
    public boolean equals(Object obj) {
        return this.modelWing.equals(((Wing) obj).modelWing) &&
                this.length == ((Wing) obj).length &&
                this.width == ((Wing) obj).width;
    }
}