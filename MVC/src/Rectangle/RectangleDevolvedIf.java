package Rectangle;

public class RectangleDevolvedIf {
    public static void main(String[] args) {
        int ax1 = 6, ay1 = 6, bx1 = 9, by1 = 9;
        int ax2 = 3, ay2 = 9, bx2 = 6, by2 = 12;

        if(bx1 < ax2 || by1 < ay2 || bx2 < ax1 || by2 < ay1) {
            System.out.println("Перетину немає");
        }

        if((by1 == ay2 && bx1 == ax2) || (ay1 == by2 && bx1 == ax2) ||
                (ay1 == by2 && ax1 == bx2) || (by1 == ay2 && ax1 == bx2)) {
            System.out.println("Перетином є крапка");
        }

        if(((bx1 == ax2) && by1 != ay2 && ay2 < by1) || ((bx2 == ax1) && by2 != ay1 && ay1 < by2)) {
            System.out.println("Перетином є вертикальна лінія");
        }

//        if(((bx1 == ax2) && ay2 < by1) || ((bx2 == ax1) && ay1 < by2)) {
//            System.out.println("Перетином є вертикальна лінія");
//        }


        if(by1 == ay2 && bx1 > ax2 || ay1 == by2 && ax1 < bx2) {
            System.out.println("Перетином є горизонтальна лінія");
        }

//        if(((by1 == ay2) && bx1 != ax2 && ax2 < bx1) || ((ay1 == by2) && ax1 != bx2 && bx2 < ax1)) {
//            System.out.println("Перетином є горизонтальна лінія");
//        }

        /*
         Аби покращити читабельність коду, перевірка, чи
         не виходить прямокутник за межі іншого по осі Y, тобто, перевірка чи вони перетинаються по осі Y,
         та чи не є цей перетин горизонтальною лінією, була винесена в зміну типу boolean
         */
        boolean checkUpAndDownBounds = (ay2 < by1) && ay1 != by2 && (ay1 < by2) && ay2 != by1;

        if(((bx1 > ax2 && bx2 > ax1 ) && checkUpAndDownBounds) ||
                ((bx2 > ax1 && bx1 > ax2) && checkUpAndDownBounds)) {
            System.out.println("Перетином є прямокутник");
        }
    }
}
