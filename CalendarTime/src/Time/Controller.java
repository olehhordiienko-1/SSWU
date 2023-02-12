package Time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Controller {
    public static boolean printCalendarForSpecifyDateAndSpecifyFormat(int specifiedYear, int specifiedMonth, String format) {
        if(specifiedMonth == LocalDate.now().getMonthValue()) {
            System.out.println("Invalid month entered, entered month don't have to equal to current month!");
            return false;
        }

        LocalDate date = LocalDate.of(specifiedYear, specifiedMonth, 7);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        // change current day to first day of current month
        date = date.minusDays(today - 1);

        DayOfWeek weekday = date.getDayOfWeek();
        // 1 - mon ... 7 - sun
        int value = weekday.getValue();

        String daysOfWeek;
        if(format.equals("ua")) {
            daysOfWeek = " Пн  Вт  Ср  Чт  Пт  Сб  Нд";
        } else {
            daysOfWeek = "Mon Tue Wed Thu Fri Sat Sun";
        }

        System.out.println(daysOfWeek);
        // Hortsman didn't fix this bug and output isn't correct, so
        // four whitespaces, because title of day of week = 3 character + 1 whitespace
        for (int i = 1; i < value; i++) {
            System.out.print("    "); // there was a one whitespace, you can see it in book
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

        return true;
    }
}
