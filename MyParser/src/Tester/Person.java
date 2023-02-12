//import java.util.Comparator;
//
//public class Person implements Comparable<Person> {
//    private final String name;
//    private final String region;
//    private final int birthYear;
//    private final boolean isMale;
//
//    public Person(String name, String region, int birthYear, boolean isMale) {
//        this.name = name;
//        this.region = region;
//        this.birthYear = birthYear;
//        this.isMale = isMale;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRegion() {
//        return region;
//    }
//
//    public int getBirthYear() {
//        return birthYear;
//    }
//
//    public boolean isMale() {
//        return isMale;
//    }
//
//    public static class RegionComparator implements Comparator<Person> {
//        @Override
//        public int compare(Person o1, Person o2) {
//            // return 0;
//            int result = o1.getRegion().toLowerCase()
//                    .compareTo(o2.getRegion().toLowerCase());
//            if (result != 0) return result;
//            result = o1.getName().compareTo(o2.getName());
//            if (result != 0) return result;
//            result = Boolean.compare(o1.isMale(), o2.isMale());
//            if (result != 0) return result;
//            return o1.getBirthYear() - o2.getBirthYear();
//        }
//    }
//
//    public static class BirthYearComparator implements Comparator<Person> {
//        @Override
//        public int compare(Person o1, Person o2) {
//            // return 0;
//            int result = o1.getBirthYear() - o2.getBirthYear();
//            if (result != 0) return result;
//            result = Boolean.compare(o1.isMale(), o2.isMale());
//            if (result != 0) return result;
//            result = o1.getName().compareTo(o2.getName());
//            if (result != 0) return result;
//            return o1.getRegion().toLowerCase()
//                    .compareTo(o2.getRegion().toLowerCase());
//        }
//    }
//
//    public static class IsMaleComparator implements Comparator<Person> {
//        @Override
//        public int compare(Person o1, Person o2) {
//            //   return 0;
//            int result = Boolean.compare(o1.isMale(), o2.isMale());
//            if (result != 0) return result;
//            result = o1.getName().compareTo(o2.getName());
//            if (result != 0) return result;
//            result = o1.getRegion().toLowerCase()
//                    .compareTo(o2.getRegion().toLowerCase());
//            if (result != 0) return result;
//            return o1.getBirthYear() - o2.getBirthYear();
//        }
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        // return 0;
//        return this.name.compareTo(o.name);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", region='" + region + '\'' +
//                ", birthYear=" + birthYear +
//                ", isMale=" + isMale +
//                '}';
//    }
//}
//
//class ControllerForNumbers {
//    public static void sorting(List<Person> people, String string) {
//        switch (string) {
//            case "1":
//                people.sort(new Person.RegionComparator());
//                break;
//            case "2":
//                people.sort(new Person.BirthYearComparator());
//                break;
//            case "3":
//                people.sort(new Person.IsMaleComparator());
//                break;
//            default:
//                Collections.sort(people);
//        }
//    }
//}
//
//class Dispatcher {
//    public static void main(String[] args) {
//
//        List<Person> people = Arrays.asList(
//                new Person("Evgeniya", "Ukraine", 1979, false),
//                new Person("Mik", "Ukraine", 1974, true),
//                new Person("Sergey", "USA", 1986, true),
//                new Person("Evgeniya", "Ireland", 1979, false),
//                new Person("Jacky", "Russia", 1979, false),
//                new Person("Michael", "Ukraine", 1978, true),
//                new Person("Olga", "USA", 1988, false));
//
//        System.out.println("Заданный список людей:");
//        people.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Сортировка по регионам:");
//        ControllerForNumbers.sorting(people, "1"); // сортировка по region
//        people.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Сортировка по году рождения:");
//        ControllerForNumbers.sorting(people, "2"); // сортировка по birthYear
//        people.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Сортировка по полу:");
//        ControllerForNumbers.sorting(people, "3"); // сортировка по isMale
//        people.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Сортировка по имени:");
//        ControllerForNumbers.sorting(people, ""); // сортировка по name
//        people.forEach(System.out::println);
//    }
//}
//        // ArrayList<Person> people = new ArrayList<>();