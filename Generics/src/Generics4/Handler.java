package Generics4;

public class Handler {
    public static void main(String[] args) {
        Dog[] ar1 = {new Dog(), new Dog()};
        Gen<Dog> ga = new Gen<>(ar1);
        Cat[] ar2 = {new Cat(), new Cat(), new Cat()};
        Dog[] ar3 = {new Dog(), new Dog()};
        ga.arraysCompare(new Gen<>(ar3));
        ga.arraysCompare(new Gen<>(ar2));
//        ga.arraysCompare(ar3);
    }
}

class Gen<T extends Animal> {
    T[] array;

    public Gen(T[] array) {
        this.array = array;
    }

    void display() {
        for(T temp : array) {
            temp.say();
        }
    }

    void arraysCompare(Gen<? extends Animal> obj) {
        if(this.array.length > obj.array.length) {
            System.out.println("1");
        } else {
            System.out.println("2");
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

    void process(){
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    void say(){
        System.out.println("Meow meow");
    }
}

class Poodle extends Dog {
    void process(){
        System.out.println("Poodle");
    }
}
