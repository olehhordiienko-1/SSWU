package Lambda.lambda4;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    public static void main(String[] args) {
//        Parent p1 = new Child();
//        p1.display();
//        Parent p2 = new Parent() {
//            @Override
//            public void display() {
//                System.out.println("anonymous");
//            }
//        };
//        p2.display();
//
//        Parent p3 = () -> {
//            System.out.println("lambda");
//        };
//        p3.display();

        List<Integer> list = new ArrayList<>();
        list.add(5); list.add(2); list.add(7); list.add(3); list.add(8);

        I1 summa = new Controller();
        System.out.println(summa.process(list));

        I1 max = new I1() {
            @Override
            public Integer process(List<Integer> list) {
                int max = Integer.MIN_VALUE;
                for(Integer temp : list) {
                    if(temp > max) {
                        max = temp;
                    }
                }
                return max;
            }
        };
        System.out.println(max.process(list));

        I1 minimum = (li) -> {
            int min = Integer.MAX_VALUE;
            for(Integer temp : li) {
                if(temp < min) {
                    min = temp;
                }
            }
            return min;
        };

        System.out.println(minimum.process(list));
    }
}

@FunctionalInterface
interface I1 {
    Integer process(List<Integer> list);
}

class Controller implements I1 { // summa
    public Integer process(List<Integer> list) {
        int sum = 0;
        for(Integer temp : list) {
            sum += temp;
        }
        return sum;
    }
}



@FunctionalInterface
interface Parent {
    void display();
}

class Child implements Parent {
    public void display() {
        System.out.println("child");
    }
}
