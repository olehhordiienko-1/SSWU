package ArraysLambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.*;

//1.Із використанням стандартних функціональних інтерфейсів з пакету java.util.function
//        та лямбда-виразів реалізувати опрацювання масивів цілих чисел із утворенням
//        колекцій:
//        - масив розділити на дві колекції:
//        - від’ємних та додатніх чисел,
//        - парних та непарних чисел,
//        - визначити середні арифметичні двох масивів, утворити колекцію з елементів обидвох
//        масивів, що знаходяться в межах між значеннями середніх арифметичних.
public class ControllerForNumbers {
    public static void splitArrayToPositiveAndNegative(Integer[] array) {
        Function<Integer[], ArrayList<Integer>> positive = (val) -> {
            ArrayList<Integer> positiveElements = new ArrayList<>();
            for (Integer temp : val) {
                if (temp > -1) {
                    positiveElements.add(temp);
                }
            }
            return positiveElements;
        };
        System.out.println(positive.apply(array));

        Function<Integer[], ArrayList<Integer>> negative = (val) -> {
            ArrayList<Integer> negativeElements = new ArrayList<>();
            for (Integer temp : val) {
                if (temp < 0) {
                    negativeElements.add(temp);
                }
            }
            return negativeElements;
        };
        System.out.println(negative.apply(array));

        System.out.println(defineElementsInLimitsMeans(negative.apply(array), positive.apply(array)));
    }

    public static void splitArrayToEvenAndOdd(Integer[] array) {
        Function<Integer[], ArrayList<Integer>> even = (val) -> {
            ArrayList<Integer> evenElements = new ArrayList<>();
            for (Integer temp : val) {
                if (temp % 2 == 0) {
                    evenElements.add(temp);
                }
            }
            return evenElements;
        };
        System.out.println(even.apply(array));

        Function<Integer[], ArrayList<Integer>> odd = (val) -> {
            ArrayList<Integer> oddElements = new ArrayList<>();
            for (Integer temp : val) {
                if (temp % 2 == 1) {
                    oddElements.add(temp);
                }
            }
            return oddElements;
        };
        System.out.println(odd.apply(array));
        System.out.println(defineElementsInLimitsMeans(even.apply(array), odd.apply(array)));
    }

    public static ArrayList<Integer> defineElementsInLimitsMeans(ArrayList<Integer> first, ArrayList<Integer> second) {
        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> betweenMeans = (ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) -> {
            ArrayList<Integer> result = new ArrayList<>();
            double firstLimit = defineMean(firstArray);
            double secondLimit = defineMean(secondArray);
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

        return betweenMeans.apply(first, second);
    }

    public static double defineMean(ArrayList<Integer> array) {
        Function<Collection<Integer>, Double> mean = (val) -> {
            int summa = 0;
            for (Integer temp : val) {
                summa += temp;
            }
            return (double) summa / val.size();
        };
        return mean.apply(array);
    }
}
