package MVC.IntegerNumberCalculator;

public class Controller {
    static int add(Model m) {
        return m.x + m.y;
    }

    static int subtract(Model m) {
        return m.x - m.y;
    }

    static int multiply(Model m) {
        return m.x * m.y;
    }

    static double divide(Model m) {
        return (double) m.x / m.y;
    }
}

//
//     int      add  (int a, int b) {return a + b;}
// return type  name (parameters)   {body}
//     1         2         3          4
//