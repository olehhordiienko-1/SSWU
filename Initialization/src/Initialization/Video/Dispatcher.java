package Initialization.Video;

public class Dispatcher {
    public static void main(String[] args) {
        House house = new House(20);
        System.out.println(house.x);
        System.out.println(house.y);
    }
}

class House {
    int x = 10;
    int y;
    Door entranceDoor = new Door(2100);
    public House(int a) {
        y = a;
        System.out.println("House");
    }
}

class Door {
    int height;
    Door(int h) {
        height = h;
        System.out.println("Door");
    }
}
