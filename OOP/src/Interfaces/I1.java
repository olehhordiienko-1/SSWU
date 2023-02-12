package Interfaces;

public interface I1 {
    void display(); // abstract public
}

abstract interface I2 {
    int a = 1;
    abstract void m();
}

class Test implements I1, I2{
    public void display() {}

    public void m(){}
}

interface I3 extends I1, I2 {
    void display();
    void m3();
}

class Test2 implements I3 {
    int a = 2;
    @Override
    public void display() {

    }

    @Override
    public void m() {

    }

    @Override
    public void m3() {

    }
}

class Parent {
    void display(){}
}

class Child extends Parent{
    @Override
    void display() {
    }

}