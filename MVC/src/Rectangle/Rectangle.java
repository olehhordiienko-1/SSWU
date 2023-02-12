package Rectangle;

public class Rectangle {
    public static void main(String[] args) {
        int ax1 = 3, ay1 = 1, bx1 = 6, by1 = 6;
        int ax2 = 1, ay2 = 1, bx2 = 3, by2 = 3;

        if(ax1 > bx2 || ax2 > bx1 || ay2 > by1 || ay1 > by2) {
            System.out.println("Прямокутники не перетинаються");
        } else if((bx2 == ax1) && (ay2 == by1)
                || (ax2 == bx1) && (ay2 == by1)
                || (ax2 == bx1) && (by2 == ay1)
                || (bx2 == ax1) && (by2 == ay1)) {
            System.out.println("Перетином є крапка");
        } else if((bx1 == ax2 || bx2 == ax1) && (ay2 < by1 && ay1 < by2)) {
            System.out.println("Перетином є вертикальна лінія");
        } else if((by1 == ay2 || by2 == ay1) && (ax1 < bx2 && ax2 < bx1)) {
            System.out.println("Перетином є горизонтальна лінія");
        } else {
            System.out.println("Перетином є прямокутник");
        }
    }
}
