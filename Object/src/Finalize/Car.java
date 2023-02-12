package Finalize;

public class Car {
    private String model;
    private boolean isImportant;
//    private static Handler backup;

    public Car() {}

    public Car(String model, boolean isImportant) {
        this.model = model;
        this.isImportant = isImportant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        this.isImportant = important;
    }

    @Override
    public String toString() {
        return this.model;
    }

    @Override
    public boolean equals(Object o){
        return this.model.equals(((Car) o).model);
    }

    @Override
    public void finalize() {
        if(isImportant) {
//            backup = this;
//            System.out.println(backup.model);
            System.out.println(this.model);
        }
    }
}
