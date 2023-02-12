package Generics1;

public class Handler {
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<>();
        g1.obj = "Serg";
//        g1.obj = 5;

        Gen<Integer> g2 = new Gen<>();
        g2.obj = 5;
//        g2.obj = "Serg";
    }
}

class Gen<T> {
    T obj;
}
