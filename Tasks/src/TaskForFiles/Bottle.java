package TaskForFiles;

public class Bottle {
    private String title;
    private double volume;
    private String material;

    public Bottle() {}

    public Bottle(String title, double volume, String material) {
        this.title = title;
        this.volume = volume;
        this.material = material;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVolume() {
        return volume;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return this.title + " " +
                this.volume + " " +
                this.material;
    }
}
