package Initialization.Video2;

public class Dispatcher {
    public static void main(String[] args) {
        House h = new House(200);
    }
}

class House {
    int square;
    {
        System.out.println("I have a dream");
    }
    House(int s) {
        System.out.println("Start Building");
        square = s;
    }
}
