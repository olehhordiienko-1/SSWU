package Covariants;

public class Dispatcher {
    public static void main(String[] args) {
        DogFactory df = new DogFactory();
        Dog myDog = df.create();
        PoodleFactory pf = new PoodleFactory();
        Dog myPoodle = pf.create();

        Poodle otherPoodle = (Poodle)pf.create(); // TOO DANGEROUS!!!
    }
}

class Dog{}

class Poodle extends Dog {
}

class SpanishPoodle extends Poodle{}

class DogFactory{
    Dog create() {
        return new Dog();
    } // pattern factory

}

class PoodleFactory extends DogFactory {
//    Dog create() {
//        return new Dog();
//    }
//    int create() {
//        return -1;
//    }
}

class SpanishPoodleFactory extends DogFactory {
    SpanishPoodle create() {
        return new SpanishPoodle();
    }
}