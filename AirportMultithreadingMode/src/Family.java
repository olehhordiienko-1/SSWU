public class Family {
    private String name; // twoLetters “aa”, “ab”, ..., “zz” – for example, up to 100 names
    private String travelTo; // 4 cities – “Kalush”, “Kosiv”, “Galych”, “Kolomiya”
    private int count; // family members count, from 1 to 4 members
    private boolean areInAirplane = true; // default - true

    public Family() {
    }

    public Family(String name, String travelTo, int count) {
        this.name = name;
        this.travelTo = travelTo;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getTravelTo() {
        return travelTo;
    }

    public int getCount() {
        return count;
    }

    public boolean isAreInAirplane() {
        return areInAirplane;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTravelTo(String travelTo) {
        this.travelTo = travelTo;
    }

    public void setAreInAirplane(boolean areInAirplane) {
        this.areInAirplane = areInAirplane;
    }

//    // this will change a current pos.
//    public void getOffThePlaneToBus(Bus bus) {
//        if (areInAirplane && this.travelTo.equals(bus.getDriveTo())) {
//            this.areInAirplane = !bus.addPassengers(this.count);
//        }
//    }

    @Override
    public String toString() {
        return "Family {" + this.name
                + ", " + this.count
                + ", " + this.travelTo
                + '}';
    }
}