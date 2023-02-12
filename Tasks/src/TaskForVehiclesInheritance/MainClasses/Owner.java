package TaskForVehiclesInheritance.MainClasses;

public class Owner {
    private String name;
    private String surname;
    private int age;

    public Owner(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Owner(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Owner" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Owner)obj).name) &&
                this.surname.equals(((Owner)obj).surname) &&
                this.age == ((Owner)obj).age;
    }
}