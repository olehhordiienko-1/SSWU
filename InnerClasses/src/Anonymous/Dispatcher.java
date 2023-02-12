package Anonymous;

public class Dispatcher {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        Parent p2 = new Parent(){
            void display() {
                System.out.println("anonymous");
            }
        };
        p2.display();
    }
}

class Parent {
    void display() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("child");
    }
}