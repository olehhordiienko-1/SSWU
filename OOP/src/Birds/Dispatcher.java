package Birds;

public class Dispatcher {
    public static void main(String[] args) {
        Hawk h = new Hawk();
        Strauss s = new Strauss();
        Penguin p = new Penguin();
        Crocozyablick c = new Crocozyablick();

        Bird[] b = new Bird[4];
        b[0] = h; // polymorph reference
        b[1] = s;
        b[2] = p;
        b[3] = c;

        for(Bird temp : b) {
            temp.move();
        }

        Bird a = new Hawk(); // polymorphism first type assignment - 15%

    }
}

class Bird {
    void move() {}
}

class Hawk extends Bird {
    void move() {
        System.out.println("Fly"); // overriding
    }
}

class Strauss extends Bird {
    void move() {
        System.out.println("Run"); // overriding
    }
}

class Penguin extends Bird {
    void move() {
        System.out.println("Swim"); // overriding
    }
}

class Crocozyablick extends Bird {
    void move() {
        System.out.println("Jump");
    }
}