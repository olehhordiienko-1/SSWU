package Rectangle;

public class RectangleFinal {
    public static void main(String[] args) {
        int ax1 = 1, ay1 = 1, bx1 = 3, by1 = 3;
        int ax2 = 3, ay2 = 1, bx2 = 4, by2 = 4;

        // не перетинаються
        if(ax1 > bx2 || ax2 > bx1 || ay2 > by1 || ay1 > by2) {
            System.out.println("Прямокутники не перетинаються");
        }

        // перетином э крапка
        if((bx2 == ax1) && (ay2 == by1)
                || (ax2 == bx1) && (ay2 == by1)
                || (ax2 == bx1) && (by2 == ay1)
                || (bx2 == ax1) && (by2 == ay1)) {
            System.out.println("Перетином є крапка");
        }

        // перетином є вертикальная лінія
        if((bx1 == ax2 || bx2 == ax1) && (ay2 < by1 && ay1 < by2)) {
            System.out.println("Перетином є вертикальна лінія");
        }

        // перетином є горизонтальна лінія
        if((by1 == ay2 || by2 == ay1) && (ax1 < bx2 && ax2 < bx1)) {
            System.out.println("Перетином є горизонтальна лінія");
        }

        // перетином є прямокутник
        if(((bx1 > ax2 && ax1 < ax2 || ay1 < by2 && ay2 < by1)
                || (bx2 > ax1 && ax2 < ax1)) && (ay2 < by1 && ay1 < by2)) {
            System.out.println("Перетином є прямокутник");
        }
    }
}
