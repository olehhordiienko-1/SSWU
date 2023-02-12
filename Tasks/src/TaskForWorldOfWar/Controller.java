package TaskForWorldOfWar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Controller {
    public static int defineCountOfDaysForWWII() {
        GregorianCalendar startDate = new GregorianCalendar(1939, Calendar.SEPTEMBER, 1);
        Date firstDate = startDate.getTime();
        GregorianCalendar endDate = new GregorianCalendar(1945, Calendar.SEPTEMBER, 2);
        Date secondDate = endDate.getTime();

        long days = secondDate.getTime() - firstDate.getTime();
        return (int) (days / 1000 / 60 / 60 / 24) + 1;
    }
}
