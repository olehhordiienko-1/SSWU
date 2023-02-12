package Main.task;

public class Controller {
    public static void defineTypeOfList(String[] array) {
        if (array.length == 0) {
            System.out.println("Arguments have not been entered");
        } else {
            String typeOfList = array[0];
            switch (typeOfList) {
                case "MARKS" -> {
                    MarksList marksList = new MarksList();
                    printList(marksList, array);
                }
                case "WEEK_DAYS" -> {
                    DaysOfWeekList daysOfWeekList = new DaysOfWeekList();
                    printList(daysOfWeekList, array);
                }
                case "PLANETS" -> {
                    PlanetsList planetsList = new PlanetsList();
                    printList(planetsList, array);
                }
                default -> System.out.println("Incorrect type of list");
            }
        }
    }

    private static void printList(MarksList marksList, String[] array) {
        for (String mark : array) {
            switch (mark) {
                case "0", "1", "2" -> System.out.println(marksList.marks.get(0));
                case "3" -> System.out.println(marksList.marks.get(1));
                case "4" -> System.out.println(marksList.marks.get(2));
                case "5" -> System.out.println(marksList.marks.get(3));
                // default -> System.out.println("Incorrect mark");
            }
        }
    }

    private static void printList(PlanetsList planetsList, String[] array) {
        for (String planet : array) {
            switch (planet) {
                case "1" -> System.out.println(planetsList.planets.get(0));
                case "2" -> System.out.println(planetsList.planets.get(1));
                case "3" -> System.out.println(planetsList.planets.get(2));
                case "4" -> System.out.println(planetsList.planets.get(3));
                case "5" -> System.out.println(planetsList.planets.get(4));
                case "6" -> System.out.println(planetsList.planets.get(5));
                case "7" -> System.out.println(planetsList.planets.get(6));
                case "8" -> System.out.println(planetsList.planets.get(7));
                // default -> System.out.println("Incorrect name of planet");
            }
        }
    }

    private static void printList(DaysOfWeekList daysOfWeekList, String[] array) {
        for (String day : array) {
            switch (day) {
                case "1" -> System.out.println(daysOfWeekList.weekDays.get(0));
                case "2" -> System.out.println(daysOfWeekList.weekDays.get(1));
                case "3" -> System.out.println(daysOfWeekList.weekDays.get(2));
                case "4" -> System.out.println(daysOfWeekList.weekDays.get(3));
                case "5" -> System.out.println(daysOfWeekList.weekDays.get(4));
                case "6" -> System.out.println(daysOfWeekList.weekDays.get(5));
                case "7" -> System.out.println(daysOfWeekList.weekDays.get(6));
                // default -> System.out.println("Incorrect day of week");
            }
        }
    }

}