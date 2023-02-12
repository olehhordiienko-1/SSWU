package Abstract;

public class Dispatcher {
    int a = 10;
    public static void main(String[] args) {
//        Animal a = new Animal();
//        Cat c = new Cat();
//        Animal a = (Cat)c;
//        Cat b = (Cat)a;
        int a = 2;

    }
}

abstract class Animal {
    int x = 10;
    abstract void say();
    void m(){}
}

class Dog extends Animal{
    void say() {
        System.out.println("Woof");
    }
//    void a();
}

class Cat extends Animal{
    void say() {
        System.out.println("Meow");
    }
}