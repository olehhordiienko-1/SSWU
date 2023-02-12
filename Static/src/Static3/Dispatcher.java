package Static3;

public class Dispatcher {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        g1.name = "Lucy";
        g1.hairColor = "rudy";
        g1.hairPaint("white");
        System.out.println(g1.hairColor);

        //SaloonCosmetic s1 = new SaloonCosmetic();
        Girl g2 = new Girl();
        g2.name = "Mary";
        g2.hairColor = "white";
        SaloonCosmetic.hairPaint(g2,"black");
        System.out.println(g2.hairColor);
        SaloonCosmetic.hairPaint(g1, "white");
        System.out.println(g1.hairColor);
    }
}
