package Composition;

public class Dispatcher {
    public static void main(String[] args) {
        Piston p = new Piston();
        p.diameter = 38;

        Diesel d = new Diesel();
        d.myPiston = p;

        Engine e = new Engine();
        e.myDiesel = d;

        Car myCar = new Car();
        myCar.myEngine = e;

        System.out.println(myCar.myEngine.myDiesel.myPiston.diameter);
    }
}

class Car {
    Engine myEngine;
}

class Engine {
    Diesel myDiesel;
}

class Diesel {
    Piston myPiston;
}

class Piston { int diameter; }
