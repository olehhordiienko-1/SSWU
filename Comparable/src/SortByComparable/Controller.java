package SortByComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    public static ArrayList<Person> sortPersonsBySpecifiedField(ArrayList<Person> persons, String sortBy) {
        switch (sortBy) {
            case "1" -> persons.sort(new Person.ComparatorByRegion());
            case "2" -> persons.sort(new Person.ComparatorByBirthYear());
            case "3" -> persons.sort(new Person.ComparatorByIsMale());
            default -> Collections.sort(persons);
        }
        return persons;
    }
//
//    public static ArrayList<Person> sortByRegionNameIsMaleBirthYear(ArrayList<Person> persons) {
//        if(!checkIfAllRegionsInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByRegion());
//        } else if(!checkIfAllNamesInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByRegion());
//        } else if(!checkIfAllIsMaleInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByIsMale());
//        } else {
//            persons.sort(new Person.ComparatorByBirthYear());
//        }
//        return persons;
//    }

//    public static ArrayList<Person> sortByBirthYearIsMaleNameRegion(ArrayList<Person> persons) {
//        if(!checkIfAllBirthYearInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByBirthYear());
//        } else if(!checkIfAllIsMaleInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByIsMale());
//        } else if(!checkIfAllNamesInPersonsAreSame(persons)){
//            persons.sort(new Person.ComparatorByRegion());
//        } else {
//            persons.sort(new Person.ComparatorByRegion());
//        }
//        return persons;
//    }

//    public static ArrayList<Person> sortByIsMaleNameRegionBirthYear(ArrayList<Person> persons) {
//        if(!checkIfAllIsMaleInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByIsMale());
//        } else if(!checkIfAllNamesInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByRegion());
//        } else if(!checkIfAllRegionsInPersonsAreSame(persons)) {
//            persons.sort(new Person.ComparatorByRegion());
//        } else {
//            persons.sort(new Person.ComparatorByBirthYear());
//        }
//        return persons;
//    }
//
//    public static boolean checkIfAllNamesInPersonsAreSame(ArrayList<Person> persons) {
//        for(int i = 0; i < persons.size() - 1; i++) {
//            if(!persons.get(i).getName().equals(persons.get(i + 1).getName())) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean checkIfAllRegionsInPersonsAreSame(ArrayList<Person> persons) {
//        for(int i = 0; i < persons.size() - 1; i++) {
//            if(!persons.get(i).getRegion().equals(persons.get(i + 1).getRegion())) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean checkIfAllBirthYearInPersonsAreSame(ArrayList<Person> persons) {
//        for(int i = 0; i < persons.size() - 1; i++) {
//            if(!(persons.get(i).getBirthYear() == persons.get(i + 1).getBirthYear())) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean checkIfAllIsMaleInPersonsAreSame(ArrayList<Person> persons) {
//        for(int i = 0; i < persons.size() - 1; i++) {
//            if(Boolean.compare(persons.get(i).isMale(), persons.get(i + 1).isMale()) != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
