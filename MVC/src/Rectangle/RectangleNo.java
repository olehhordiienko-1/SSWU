package Rectangle;

public class RectangleNo {
    public static void main(String[] args) {
        int ax1 = 1, ay1 = 1, bx1 = 6, by1 = 3;
        int ax2 = 1, ay2 = 1, bx2 = 6, by2 = 3;

        if(bx1 < ax2 || by1 < ay2 || bx2 < ax1 || by2 < ay1) {
            System.out.println("Перетину немає");
        } else if((by1 == ay2 && bx1 == ax2) || (ay1 == by2 && bx1 == ax2) || (ay1 == by2 && ax1 == bx2) || (by1 == ay2 && ax1 == bx2)) {
            System.out.println("Перетином є крапка");
        } else if(bx1 == ax2 || bx2 == ax1) {
            System.out.println("Перетином є вертикальна лінія");
        } else if(by1 == ay2 || ay1 == by2) {
            System.out.println("Перетином є горизонтальна лінія");
        } else {
            System.out.println("Перетином є прямокутник");
        }
    }
}
