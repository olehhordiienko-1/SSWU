package TaskForGenerics;

public class Cat extends Animal {
    private String breed;
    private String typeHair;
    private int countMustache;

    public Cat() {
    }

    public Cat(int age, int intelligence, int power, int agility, String breed, String typeHair, int countMustache) {
        super(age, intelligence, power, agility);
        this.breed = breed;
        this.typeHair = typeHair;
        this.countMustache = countMustache;
    }

    public String getBreed() {
        return breed;
    }


    public String getTypeHair() {
        return typeHair;
    }


    public int getCountMustache() {
        return countMustache;
    }

    public void setCountMustache(int countMustache) {
        this.countMustache = countMustache;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                " breed='" + breed + '\'' +
                ", typeHair='" + typeHair + '\'' +
                ", countMustache=" + countMustache +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
