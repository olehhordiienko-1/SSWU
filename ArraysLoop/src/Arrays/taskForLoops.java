package Arrays;

public class taskForLoops {
    public static void main(String[] args) {
        System.out.println((199 * 199 + 199 * 199) % 49);
//        taskForLoops tasks = new taskForLoops();
//
//        tasks.findDivisibleForValue(35, 27);
//        tasks.determinateValueAbc(92);
//        tasks.calculateAmountOfDivisibleByDefinedDivider(200, 49);
//        tasks.threeDigitsNumberSubtractSumOfDigitsInCube(100, 1000);
//        tasks.calculateAmountOfMirroredCouples(100, 1000);
    }

    // До числа 35 дописати ліворуч і праворуч по одній однаковій (інший варіант
    // завдання - довільній) цифрі такій, щоб утворене число було кратним довільному
    // заданому натуральному числу.
    public void findDivisibleForValue(int centerValue, int divider) {
        int temp;
        for (int rightNumber = 0; rightNumber < 10; rightNumber++) {
            for (int leftNumber = 0; leftNumber < 10; leftNumber++) {
                // 1351 1352 .. 1359 .. 9359
                temp = rightNumber * 1000 + centerValue * 10 + leftNumber;

                if (temp % divider == 0) {
                    System.out.println("divisible number = " + temp + " divider = " + divider);
                }
            }
        }
    }

    // Знайти всі натуральні числа x , що задовольняють рівнянню:
    // 92abc = 874 * x.
    // Ліворуч стоїть п'ятицифрове число (a, b, c – цифри в межах 0...9).
    public void determinateValueAbc(int value) {
        int leftValue = value * 1000;

        // 92abc -> 92000 ... 92369 ... 92999 (a, b, c - є [0; 9])
        for (int rightValue = 0; rightValue < 1000; rightValue++) {
            findRootX(leftValue + rightValue);
        }
    }

    private void findRootX(int value) {
        for (int root = 0; 874 * root < value + 1; root++) {
            if (value == 874 * root) {
                System.out.println(value + " = 874 * " + root);
            }
        }
    }

    // Скільки існує пар (a, b) натуральних чисел, менших 200, таких, що сума a*a + b*b
    // ділиться на 49?
    public void calculateAmountOfDivisibleByDefinedDivider(int bound, int divider) {
        int counterOfCouples = 0;

        for (int leftValueA = 0; leftValueA < bound; leftValueA++) {
            for (int rightValueB = 0; rightValueB < bound + 1; rightValueB++) {
                if ((leftValueA * leftValueA + rightValueB * rightValueB) % divider == 0) {
                    counterOfCouples++;
                }
            }
        }
        System.out.println("amount of couples a & b = " + counterOfCouples
                + " divider = " + divider);
    }

    // Від тризначного числа відняли суму кубів його цифр. Який найбільший результат
    // міг при цьому вийти?
    public void threeDigitsNumberSubtractSumOfDigitsInCube(int startValue, int endValue) {
        double maxValue = (int) Double.NEGATIVE_INFINITY;
        double value;
        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int number = 0;

        for (int threeDigitNumber = startValue; threeDigitNumber < endValue; threeDigitNumber++) {
            firstDigit = threeDigitNumber / 100 % 10;
            secondDigit = threeDigitNumber / 10 % 10;
            thirdDigit = threeDigitNumber % 10;

            value = threeDigitNumber - (Math.pow(firstDigit, 3)
                    + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3));

            if (maxValue < value) {
                maxValue = value;
                number = threeDigitNumber;
            }
        }
        System.out.println("max result: " + maxValue + " for number: " + number);
    }

    // Скільки існує натуральних чисел таких, які можна подати у вигляді суми двох
    // тризначних чисел cba + abc, (a і с не рівні 0)? (Приклад: 1595 = 748 + 847).

    public void calculateAmountOfMirroredCouples(int startValue, int endValue) {
        int counterOfCouples = 0;
        for (int leftNumber = startValue; leftNumber < endValue; leftNumber++) {
            if (leftNumber % 10 != 0) {
                // System.out.println(reverseNumber(leftNumber) + " " + leftNumber);
                counterOfCouples++;
            }
        }
        System.out.println("amount of a mirrored values: " + counterOfCouples);
    }

    private int reverseNumber(int number) {
        int reversedNumber = 0;
        while(number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}
