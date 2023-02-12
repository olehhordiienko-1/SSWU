package Main.taskV2;

import java.util.ArrayList;

public class DaysOfWeekList {
    ArrayList<String> weekDays;
    String typeOfList;

    public DaysOfWeekList() {
        typeOfList = "WEEK_DAYS";

        weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
    }

    public void printList(String[] array) {
        for (String s : array) {
            switch (s) {
                case "1" -> System.out.println(weekDays.get(0));
                case "2" -> System.out.println(weekDays.get(1));
                case "3" -> System.out.println(weekDays.get(2));
                case "4" -> System.out.println(weekDays.get(3));
                case "5" -> System.out.println(weekDays.get(4));
                case "6" -> System.out.println(weekDays.get(5));
                case "7" -> System.out.println(weekDays.get(6));
            }
        }
    }
}
