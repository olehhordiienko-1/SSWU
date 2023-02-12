package ArraysLambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ControllerWithInnerClasses {
    public static void testingFunctionalInterfacesWithLambda(Integer[] array) {
        System.out.println("---------------------------------");
        ArrayList<Integer> posElements =  positive.apply(array);
        System.out.println("positive: " + posElements);
        ArrayList<Integer> negElements = negative.apply(array);
        System.out.println("negative: " + negElements);
        System.out.println(betweenMeans.apply(negElements, posElements));

        ArrayList<Integer> evenElements =  even.apply(array);
        System.out.println("even: " + evenElements);
        ArrayList<Integer> oddElements = odd.apply(array);
        System.out.println("odd: " + oddElements);
        System.out.println(betweenMeans.apply(evenElements, oddElements));
    }


    public static Function<Integer[], ArrayList<Integer>> positive = (val) -> {
        ArrayList<Integer> positiveElements = new ArrayList<>();
        for (Integer temp : val) {
            if (temp > -1) {
                positiveElements.add(temp);
            }
        }
        return positiveElements;
    };

    public static Function<Integer[], ArrayList<Integer>> negative = (val) -> {
        ArrayList<Integer> negativeElements = new ArrayList<>();
        for (Integer temp : val) {
            if (temp < 0) {
                negativeElements.add(temp);
            }
        }
        return negativeElements;
    };

    public static Function<Collection<Integer>, Double> mean = (val) -> {
        int summa = 0;
        for (Integer temp : val) {
            summa += temp;
        }
        return (double) summa / val.size();
    };

    public static Function<Integer[], ArrayList<Integer>> even = (val) -> {
        ArrayList<Integer> evenElements = new ArrayList<>();
        for (Integer temp : val) {
            if (temp % 2 == 0) {
                evenElements.add(temp);
            }
        }
        return evenElements;
    };

    public static Function<Integer[], ArrayList<Integer>> odd = (val) -> {
        ArrayList<Integer> oddElements = new ArrayList<>();
        for (Integer temp : val) {
            if (temp % 2 == 1) {
                oddElements.add(temp);
            }
        }
        return oddElements;
    };

    public static BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> betweenMeans = (ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) -> {
        ArrayList<Integer> result = new ArrayList<>();
        double firstLimit = mean.apply(firstArray);
        double secondLimit = mean.apply(secondArray);
        System.out.println(firstLimit + " " + secondLimit);

        for (Integer temp : firstArray) {
            if (temp > firstLimit && temp < secondLimit) {
                result.add(temp);
            }
        }

        for (Integer temp : secondArray) {
            if (temp > firstLimit && temp < secondLimit) {
                result.add(temp);
            }
        }
        return result;
    };
}
