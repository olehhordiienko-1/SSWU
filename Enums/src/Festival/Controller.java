package Festival;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    public static void testDifferentSortingWaysToFest() {
        ArrayList<Fest> firstFestsList = new ArrayList<>(List.of(
                new Fest("Eternal solstice", "New-York, USA", YearMonth.JULY),
                new Fest("Snowy noon", "San-Francisco, USA", YearMonth.DECEMBER),
                new Fest("Windy infinity", "London, UK", YearMonth.FEBRUARY),
                new Fest("Beer pong", "Berlin, Germany", YearMonth.SEPTEMBER),
                new Fest("Wine rain", "Tbilisi, Georgia", YearMonth.JULY),
                new Fest("Rainbow moon", "Rio-de-Janeiro, Brazil", YearMonth.AUGUST)
        ));
        Collections.sort(firstFestsList);
        View.printListFest(firstFestsList);

        ArrayList<Fest> secondFestsList = new ArrayList<>(List.of(
                new Fest("Eternal solstice", "New-York, USA", YearMonth.JANUARY),
                new Fest("Eternal solstice", "New-York, USA", YearMonth.DECEMBER),
                new Fest("Eternal solstice", "New-York, USA", YearMonth.JULY),
                new Fest("Eternal solstice", "New-York, USA", YearMonth.SEPTEMBER),
                new Fest("Eternal solstice", "New-York, USA", YearMonth.APRIL),
                new Fest("Eternal solstice", "New-York, USA", YearMonth.AUGUST)
        ));
        Collections.sort(secondFestsList);
        View.printListFest(secondFestsList);

        ArrayList<Fest> thirdFestsList = new ArrayList<>(List.of(
                new Fest("Golden reborn", "Tokyo, old Kyoto, Japan", YearMonth.JANUARY),
                new Fest("New Year fest", "New-York, USA", YearMonth.DECEMBER),
                new Fest("Fest of Victory", "Kyiv, Ukraine", YearMonth.JULY),
                new Fest("Beer rain fest", "Prague, Czech Republic", YearMonth.SEPTEMBER),
                new Fest("Contemporary Art fest", "Buharest, Romania", YearMonth.APRIL),
                new Fest("Eternal solstice", "Budapesht, Hungary", YearMonth.AUGUST)
        ));
        thirdFestsList.sort(new Fest.SortByPlace());
        View.printListFest(thirdFestsList);
    }
}
