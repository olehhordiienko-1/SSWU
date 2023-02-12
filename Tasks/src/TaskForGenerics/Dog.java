package TaskForGenerics;

public class Dog extends Animal {
    private String hairColor;
    private boolean isTrained;
    private boolean isVaccinated;
    private boolean hasPassport;

    public Dog() {
    }

    public Dog(int age, int intelligence, int power, int agility, String hairColor, boolean isTrained, boolean isVaccinated, boolean hasPassport) {
        super(age, intelligence, power, agility);
        this.hairColor = hairColor;
        this.isTrained = isTrained;
        this.isVaccinated = isVaccinated;
        this.hasPassport = hasPassport;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isHasPassport() {
        return hasPassport;
    }

    public void setHasPassport(boolean hasPassport) {
        this.hasPassport = hasPassport;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                " hairColor='" + hairColor + '\'' +
                ", isTrained=" + isTrained +
                ", isVaccinated=" + isVaccinated +
                ", hasPassport=" + hasPassport +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
