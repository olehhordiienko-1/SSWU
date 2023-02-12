package Polymorphism;

public class Dispatcher {
    public static void main(String[] args) {
//        int x = 10;
//        double y = x;
//        int z = (int) y;
        Dog d = new Dog(); // direct reference
        Animal a = d;      // polymorph reference
        a = new Cat();
        a.say();
        System.out.println(a.x);
//        System.out.println(a.y);
        Cat c = new Cat();
        System.out.println(c.y);
    }
}

class Animal {
    int x = 10;
    void say(){}
}

class Dog extends Animal {
    int x = 20;
    // overriding
    void say() {
        System.out.println("WOOF");
    }
}

class Cat extends Animal {
    int x = 30;
    int y = 40;
    // overriding
    void say() {
        System.out.println("MEOW");
    }
}