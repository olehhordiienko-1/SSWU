package SwitchContinueBreak;

public class SwitchCae {
    public static void main(String[] args) {
//        int days[] = {5, 3, 7, 4, 1};
//        for(int i = 0; i < days.length; i++) {
//            switch (days[i]) { // byte, short, -long, int, String, enum
//                case 1: System.out.println("Понеділок"); break;
//                case 2: System.out.println("Вівторок"); break;
//                case 3: System.out.println("Середа"); break;
//                case 4: System.out.println("Четвер"); break;
//                case 5: System.out.println("Пʼятниця"); break;
//                case 6: System.out.println("Субота"); break;
//                case 7: System.out.println("Неділяк"); break;
//                default: System.out.println("Некоректне число"); break;
//            }
//        }
        String months[] = {"February", "May", "June", "July", "November", "December"};
        for(int i = 0; i < months.length; i++) {
            switch (months[i]) {
                case "December":
                case "January":
                case "February": System.out.println("Winter"); break;
                case "March":
                case "April":
                case "May": System.out.println("Spring"); break;
                case "June":
                case "July":
                case "August": System.out.println("Summer"); break;
                case "September":
                case "November":
                case "October": System.out.println("Autumn"); break;

            }
        }
    }
}
