package Enums;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.days);
        double average = 0;
        Season[] arr = Season.values();
//        arr = Season.
        for (int x = 0; x < Season.values().length; x++)
        for(Season temp : Season.values()) { // Enumeration - superclass from enums
            average += temp.temperature;
        }

        int x = 100;
        switch (x) {
            case 1:
                System.out.println("odsoao");
                break;
            default:
                System.out.println("siu");
            case 3:
                System.out.println("fdsf");
        }
        System.out.println(average/4);
    }
}
