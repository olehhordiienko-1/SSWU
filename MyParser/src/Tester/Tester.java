package Tester;

public class Tester {
    public static void main(String[] args) {
        Animal dog = new Poodle();
//        System.out.println(((Animal)dog).s);
//        Dog d1 = new Animal();
//        Dog d1 = (Animal) dog;
        Animal dog2 = (Animal)new Poodle();
        dog2.doSomething();
//        ((Animal)dog).doSomething();
//        Animal a1 = dog;
//        Poodle p1 = (Dog)dog;
//        Animal dog = new Dog();
//        dog.say();
//        Dog dog2 = (Dog)dog;
//        dog2.say();
        Dog testD = new Dog();
        Animal testA = new Animal();
        Object a33 = (Object)testD;
        testD = (Dog)testA;

    }
}

class Animal {
    static String s;
    Animal() {
        s = "Animal";
    }

    static void say() {
        System.out.println("idk");
    }

    void doSomething() {
        System.out.println("Something fa");
    }
}

class Dog extends Animal {
    Dog() {
        s = "Dog";
    }

    static void say() {
        System.out.println("woof woof dog");
    }

    void doSomething() {
        System.out.println("Something ch");
    }
}

class Poodle extends Dog{

}