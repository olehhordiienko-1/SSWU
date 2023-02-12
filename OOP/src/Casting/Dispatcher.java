package Casting;

public class Dispatcher {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();
        Animal a4 = new Poodle();

        // Animal to Dog - Runtime Error
        if(a1 instanceof Dog) {
            Dog d1 = (Dog) a1;
            System.out.println("1");
        }

        // Dog to Dog - OK
        if(a2 instanceof Dog) {
            Dog d2 = (Dog) a2;
            System.out.println("2");
        }

        // Cat to Dog - Runtime Error
//        if(a3 instanceof Dog) {
            Dog d3 = (Dog) a3;
            System.out.println("3");
//        }

        // OK
        if(a4 instanceof Dog) {
            Dog d4 = (Poodle)a4;
            System.out.println("4");
        }

        System.out.println("XHU");

    }
}

class Animal{ }
class Dog extends Animal{}
class Cat extends Animal{}
class Poodle extends Dog{}