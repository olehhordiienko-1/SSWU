package TaskForSerialization;

public class Boat implements Comparable<Boat>{
    private int countPassengers;
    private String material;

    public Boat() {}

    public Boat(int countPassengers, String material) {
        this.countPassengers = countPassengers;
        this.material = material;
    }

    public int getCountPassengers() {
        return this.countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return this.material + " " + this.countPassengers;
    }

    @Override
    public boolean equals(Object obj) {
        return this.material.equals(((Boat) obj).material) &&
                this.countPassengers == ((Boat) obj).countPassengers;
    }

    @Override
    public int compareTo(Boat boat) {
        int result = this.material.compareTo(boat.material);
        if(result == 0) {
            result = this.countPassengers - boat.countPassengers;
        }
        return result;
    }
}
