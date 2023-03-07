public class BusFactory {

    public Bus getBus(int passengers, String driveTo) {
        return new Bus(passengers, driveTo);
    }

}
