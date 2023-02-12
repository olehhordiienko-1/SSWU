package Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;
public class Handler {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
//        System.out.println(gc.get(YEAR));
//        System.out.println(gc.get(MONTH));
//        System.out.println(gc.get(DAY_OF_MONTH));
//        System.out.println(gc.get(DAY_OF_WEEK));
        gc.set(MONTH, DECEMBER);
        gc.set(DAY_OF_MONTH, 21);
//        System.out.println(gc.get(DAY_OF_WEEK));
        gc.add(DAY_OF_MONTH, 15);
        System.out.println(gc.get(YEAR));
        System.out.println(gc.get(MONTH));
        System.out.println(gc.get(DAY_OF_MONTH));
        System.out.println(gc.get(DAY_OF_WEEK));
        Date now = gc.getTime(); // convert gc to date
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(now);
        System.out.println();
    }
}
