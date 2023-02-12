package Arrays;

import java.util.Arrays;

public class taskForArrays {
    public static void main(String[] args) {
        taskForArrays tasks = new taskForArrays();
        int[] array = {-2, 8, -3, 7, 4, -6, -5, 5};

        tasks.calculateAmountAndSumOfEven(array);
        tasks.determineMaxNegativeAndMinPositive(array);
        tasks.incrementPositiveAndDecrementNegative(array);
        tasks.swapMaxAndMin(array);
        tasks.removeMaxAndMin(array);
        tasks.determineAverageAndAmountOfElementsMoreThanAverage(array);
    }

    // порахувати кількість та суму парних елементів масиву
    public void calculateAmountAndSumOfEven(int[] array) {
        int sumEvenElements = 0;
        int countEvenElements = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEvenElements += array[i];
                countEvenElements++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("sum of even elements = " + sumEvenElements
                + "\ncount of even elements = " + countEvenElements);
    }

    // визначити максимальний з від’ємних та мінімальний з додатніх елементів масиву
    public void determineMaxNegativeAndMinPositive(int[] array) {
        int maxNegative = (int) Double.NEGATIVE_INFINITY;
        int minPositive = (int) Double.POSITIVE_INFINITY;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 & maxNegative < array[i]) {
                maxNegative = array[i];
            } else if (array[i] > -1 & minPositive > array[i]) {
                minPositive = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("max from negative elements = " + maxNegative
                + "\nmin from positive elements = " + minPositive);
        System.out.println();
    }

    // збільшити на одиницю додатні елементи масиву та зменшити на одиницю від’ємні
    // елементи масиву із утворенням нового масиву
    public void incrementPositiveAndDecrementNegative(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result[i] = array[i] + 1;
            } else {
                result[i] = array[i] - 1;
            }
        }
        System.out.println("array: " + Arrays.toString(array));
        System.out.println("result: " + Arrays.toString(result));
        System.out.println();
    }

    // в масиві поміняти місцями максимум та мінімум із утворенням нового масиву
    public void swapMaxAndMin(int[] array) {
        int[] result = new int[array.length];
        int max = (int) Double.NEGATIVE_INFINITY;
        int min = (int) Double.POSITIVE_INFINITY;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }

        int temp = result[indexMin];
        result[indexMin] = result[indexMax];
        result[indexMax] = temp;

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("result: " + Arrays.toString(result));
        System.out.println();
    }

    // в масиві усунути максимум та мінімум із утворенням нового масиву
    public void removeMaxAndMin(int[] array) {
        int max = (int) Double.NEGATIVE_INFINITY;
        int min = (int) Double.POSITIVE_INFINITY;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }

        int[] result = new int[array.length - 2];
        int indexResult = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < max & array[i] > min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("result: " + Arrays.toString(result));
        System.out.println();
    }

    // визначити середнє арифметичне елементів масиву та кількість елементів цього
    // масиву, що є більшими за середнє арифметичне.
    public void determineAverageAndAmountOfElementsMoreThanAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        int countMoreThanAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                countMoreThanAverage++;
            }
        }

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("average = " + average
                + "\namount elements more than average = " + countMoreThanAverage);
        System.out.println();
    }
}