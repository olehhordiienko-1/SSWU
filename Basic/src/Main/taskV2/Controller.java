package Main.taskV2;

public class Controller {
    public static void defineTypeOfList(String[] array) {
        if (array.length == 0) {
            System.out.println("Arguments have not been entered");
        } else {
            String typeOfList = array[0];
            switch (typeOfList) {
                case "MARKS" -> {
                    MarksList marksList = new MarksList();
                    marksList.printList(array);
                }
                case "WEEK_DAYS" -> {
                    DaysOfWeekList daysOfWeekList = new DaysOfWeekList();
                    daysOfWeekList.printList(array);
                }
                case "PLANETS" -> {
                    PlanetsList planetsList = new PlanetsList();
                    planetsList.printList(array);
                }
                default -> System.out.println("Incorrect type of list");
            }
        }
    }

}
