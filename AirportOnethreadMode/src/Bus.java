public class Bus implements Runnable{
    private final int maxPassengerCount; // 6 or 7 or 8
    private int passengersCount = 0; // have to be maximum
    private String driveTo; // 4 cities – “Kalush”, “Kosiv”, “Galych”, “Kolomiya”

    public Bus(int maxPassengerCount, String driveTo) {
        this.maxPassengerCount = maxPassengerCount;
        this.driveTo = driveTo;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    // pick up passengers, if can
    public boolean addPassengers(int newPassengers) {
        if(this.passengersCount + newPassengers < this.maxPassengerCount + 1) {
            this.passengersCount += newPassengers;
            return true;
        }
        return false;
    }

    public void setDriveTo(String driveTo) {
        this.driveTo = driveTo;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public String getDriveTo() {
        return driveTo;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "maxPassengerCount=" + maxPassengerCount +
                ", passengersCount=" + passengersCount +
                ", driveTo='" + driveTo + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}