package TaskForGenerics;

public class Animal {
    private int age;
    private int intelligence;
    private int power;
    private int agility;

    public Animal() {
    }

    public Animal(int age, int intelligence, int power, int agility) {
        this.age = age;
        this.intelligence = intelligence;
        this.power = power;
        this.agility = agility;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAgility() {
        return this.agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", intelligence=" + intelligence +
                ", power=" + power +
                ", agility=" + agility;
    }

    @Override
    public boolean equals(Object obj) {
        return this.age == ((Animal) obj).age &&
                this.agility == ((Animal) obj).agility &&
                this.intelligence == ((Animal) obj).intelligence &&
                this.power == ((Animal) obj).power;
    }

    @Override
    public int hashCode() {
        return 17 * this.age + 19 * this.intelligence +
                this.power * 13;
    }
}
