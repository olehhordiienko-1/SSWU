package Main.task;

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
}
