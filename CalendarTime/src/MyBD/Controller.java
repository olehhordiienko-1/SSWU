package MyBD;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static java.util.Calendar.*;

public class Controller {
    static GregorianCalendar myBirthday = new GregorianCalendar(2022, APRIL, 27);
    static ArrayList <String> daysOfWeek = new ArrayList<>(List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));

    public static void printAllDaysOfWeekForDateForCount(int count) {
        for(int i = 0; i < count; i++) {
            myBirthday.add(YEAR, 1);
            System.out.println(daysOfWeek.get(myBirthday.get(DAY_OF_WEEK) - 1) + " for " + myBirthday.get(YEAR));
        }
    }
}
