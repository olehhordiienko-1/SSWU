package MVC.IntegerNumberCalculator;

public class Dispatcher {
    public static void main(String[] args) {
//        int a = 5;
        Model m1 = new Model(50, 8);
        Model m2 = new Model(90, 12);
//        m1.x = 50;
//        m1.y = 8;
//        m2.x = 90;
//        m2.y = 12;
        int summa = Controller.add(m1);
        double div = Controller.divide(m2);
        View.display(summa);
        View.display(div);
    }
}
// 50 + 8   m1
// 90 / 12  m2