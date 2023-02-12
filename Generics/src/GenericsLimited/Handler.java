package GenericsLimited;

public class Handler {
    public static void main(String[] args) {
        Animal[] a1 = {new Dog(), new Cat()};
        Dog[] d1 = {new Dog(), new Dog()};
        Cat[] c1 = {new Cat(), new Cat()};
        AnimalHandler.handle(a1);
        AnimalHandler.handle(d1);
        AnimalHandler.handle(c1);
    }
}
class AnimalHandler{
    Animal[] animals;
    static <T extends Animal> void handle(T[] array){
        for(T t : array) {
            t.say();
        }
    }
}
abstract class Animal {
    abstract void say();
}

class Dog extends Animal {
    void say(){
        System.out.println("Woof woof");
    }
}

class Cat extends Animal {
    void say(){
        System.out.println("Meow meow");
    }
}