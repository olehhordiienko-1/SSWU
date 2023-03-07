import java.util.List;

public class Controller {
    public static void simulateAirport(List<Bus> buses, List<Airplane> airplanes) {
        boolean isAllPlanesEmpty = false;
        int count;

        while (!isAllPlanesEmpty) {
            count = 0;
            for (Airplane airplane : airplanes) {
                count += airplane.getFamilies().size();
                List<Family> temp = airplane.getFamilies();

                for (Family family : temp) {
                    for (Bus bus : buses) {
                        family.getOffThePlaneToBus(bus);

                        if (!family.isAreInAirplane()) {
                            break;
                        }
                    }
                }

                if (!airplane.clearList()) {
                    for (Family family : temp) {
                        buses.add(new Bus(family.getCount() * 2, family.getTravelTo()));
                    }
                }
            }
            isAllPlanesEmpty = count < 1;
        }

        System.out.println("done");
    }
}
