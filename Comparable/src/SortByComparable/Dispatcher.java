package SortByComparable;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
        // region: name => isMale => birthYear
        ArrayList<Person> firstGroup = new ArrayList<>(List.of(
                new Person("Oleh", "Kharkiv", 2003, true),
                new Person("Oleh", "Kharkiv", 2001, true),
                new Person("Oleh", "Kharkiv", 2003, true),
                new Person("Oleh", "Kharkiv", 2022, true),
                new Person("Oleh", "Kharkiv", 2005, true))
        );
        System.out.println(Controller.sortPersonsBySpecifiedField(firstGroup, "1"));

        // birthYear: isMale => name => region
        ArrayList<Person> secondGroup = new ArrayList<>(List.of(
                new Person("Oleh", "Kyiv", 2003, true),
                new Person("Oleh", "Kharkiv", 2003, true),
                new Person("Oleh", "Odessa", 2003, true),
                new Person("Oleh", "Lviv", 2003, true),
                new Person("Oleh", "Dnipro", 2003, true))
        );
        System.out.println(Controller.sortPersonsBySpecifiedField(secondGroup, "2"));

        // isMale: name => region => birthYear
        ArrayList<Person> thirdGroup = new ArrayList<>(List.of(
                new Person("Oleh", "Kharkiv", 2003, false),
                new Person("Oleh", "Kharkiv", 2003, true),
                new Person("Oleh", "Kharkiv", 2003, false),
                new Person("Oleh", "Kharkiv", 2003, true),
                new Person("Oleh", "Kharkiv", 2003, false))
        );
        System.out.println(Controller.sortPersonsBySpecifiedField(thirdGroup, "3"));

        // name => region => birthYear => isMale
        ArrayList<Person> fourthGroup = new ArrayList<>(List.of(
                new Person("Oleh", "Kharkiv", 2001, false),
                new Person("Oleh", "Kharkiv", 2002, true),
                new Person("Oleh", "Kharkiv", 2012, false),
                new Person("Oleh", "Kharkiv", 2005, true),
                new Person("Oleh", "Kharkiv", 1998, false))
        );
        System.out.println(Controller.sortPersonsBySpecifiedField(fourthGroup, "666"));
    }
}
