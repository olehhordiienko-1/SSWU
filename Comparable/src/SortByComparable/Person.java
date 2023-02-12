package SortByComparable;

import java.util.Comparator;

public class Person implements Comparable <Person> {
    private String name;
    private String region;
    private int birthYear;
    private boolean isMale;

    public Person() {}

    public Person(String name, String region, int birthYear, boolean isMale) {
        this.name = name;
        this.region = region;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return this.name + " " +
                this.region + " " +
                this.birthYear + " " +
                this.isMale;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name) &&
                this.region.equals(((Person) obj).region) &&
                this.birthYear == ((Person) obj).birthYear &&
                this.isMale == ((Person) obj).isMale;
    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if (result != 0) {
            return result;
        } else {
            result = this.region.compareTo(person.region);
            if (result != 0) {
                return result;
            } else {
                result = this.birthYear - person.birthYear;
                if (result != 0) {
                    return result;
                } else {
                    return Boolean.compare(this.isMale, person.isMale);
                }
            }
        }
    }

    public static class ComparatorByBirthYear implements Comparator<Person> {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            int result = firstPerson.getBirthYear() - secondPerson.getBirthYear();
            if(result != 0) {
                return result;
            } else {
                result = Boolean.compare(firstPerson.isMale(), secondPerson.isMale());
                if(result != 0) {
                    return result;
                } else {
                    result = firstPerson.getName().compareTo(secondPerson.getName());
                    if(result != 0) {
                        return result;
                    } else {
                        return firstPerson.getRegion().compareTo(secondPerson.getRegion());
                    }
                }
            }
        }
    }

    public static class ComparatorByIsMale implements Comparator<Person>{
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            int result = Boolean.compare(firstPerson.isMale(), secondPerson.isMale());
            if(result != 0) {
                return result;
            } else {
                result = firstPerson.getName().compareTo(secondPerson.getName());
                if(result != 0) {
                    return result;
                } else {
                    result = firstPerson.getRegion().compareTo(secondPerson.getRegion());
                    if(result != 0) {
                        return result;
                    } else {
                        return firstPerson.getBirthYear() - secondPerson.getBirthYear();
                    }
                }
            }
        }
    }

    public static class ComparatorByRegion implements Comparator<Person> {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            int result = firstPerson.getRegion().compareTo(secondPerson.getRegion());
            if(result != 0) {
                return result;
            } else {
                result = firstPerson.getName().compareTo(secondPerson.getName());
                if(result != 0) {
                    return result;
                } else {
                    result = Boolean.compare(firstPerson.isMale(), secondPerson.isMale());
                    if(result != 0) {
                        return result;
                    } else {
                        return firstPerson.getBirthYear() - secondPerson.getBirthYear();
                    }
                }
            }
        }
    }
}
