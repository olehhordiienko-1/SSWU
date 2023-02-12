package Cycles;

public class MathTasks {
    public static void main(String[] args) {
//        find35();
//        findAValueOfX();
//        findDividedBy49();
//        threeDigitsNumberDividedSumOfCubes();
        threeDigitsNumbersSum();
    }

    public static void find35() {
        int value = 35;
        int utility;
        int divisible = 6;

        for (int i = 0; i < 10; i++) {
            utility = i * 1000 + value * 10 + i;

            if (utility % divisible == 0) {
                System.out.println("number = " + utility + " is divisible by " + divisible);
            }
        }
    }

    public static void findAValueOfX() {
        for (int i = 92000; i < 92999; i++) {
            isEqual92abcTo874X(i);
        }
    }

    public static void isEqual92abcTo874X(int value) {
        for (int i = 1; value + 1 > 874 * i; i++) {
            if (value == 874 * i) {
                System.out.println(value + " = 874 * " + i);
            }
        }
    }

    public static void findDividedBy49() {
        int counterOfCouples = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if ((i * i + j * j) % 49 == 0) {
                    counterOfCouples++;
                    // System.out.println("value = " + (i * i + j * j) + " a = " + i + " b = " + j);
                }
            }
        }

        System.out.println("amount of couples = " + counterOfCouples);
    }

    public static void threeDigitsNumberDividedSumOfCubes() {
        double maxResult = Integer.MIN_VALUE;
        int result = 0;
        double value;

        for (int i = 100; i < 999; i++) {
            value = i - (Math.pow(i % 10, 3) + Math.pow(i / 10 % 10, 3) + Math.pow(i / 100 % 10, 3));
            //S ystem.out.println(value + " " + i);
            if (maxResult < value) {
                maxResult = value;
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void threeDigitsNumbersSum() {
        int counter = 0;
        for (int i = 100; i < 1000; i++) {
            // abc = cba
            // 123 = 321

            if (i % 10 != 0) {
                System.out.println(reverseNumber(i) + i);
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        while(number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

}
