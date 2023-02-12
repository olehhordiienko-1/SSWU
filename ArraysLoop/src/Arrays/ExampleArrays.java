package Arrays;

public class ExampleArrays {
    public static void main(String[] args) {
//        int[] dates = {27, 21, 31, 4, 5, 15, 14};

        // sum & average of dates
//        int sum = 0;
//        for (int index = 0; index < dates.length; index++)  {
//            sum = sum + dates[index]; // index = 1: 27 + 21 -> sum  sum = 48
//        }
//        System.out.println(sum);
//        double average = (double) sum / dates.length;
//        System.out.println(average);

        // max of dates

//        int max = (int)Double.NEGATIVE_INFINITY;
//        for(int index = 0; index < dates.length; index++) {
//            if(max < dates[index]) {
//                max = dates[index];
//            }
//        }
//        System.out.println(max);

        // попарна сума елементів двох масивів однакової довжини
//        int[] array1 = {7, 12, 8, 4};
//        int[] array2 = {9, 3, 11, 8};
//        int[] result = new int[array1.length];
//
//        for(int index = 0; index < array1.length; index++) {
//            result[index] = array1[index] + array2[index];
//        }
//
//        System.out.println(taskForArrays.toString(result));
//
////        for(int i = 0; i < result.length; i++) {
////            System.out.print(result[i] + " ");
////        }

//        // конкатенація двох масивів
//        int[] array1 = {7, 12, 8, 4};
//        int[] array2 = {9, 3, 11, 8, 5};
//        // 7, 12, 8, 4, 9, 3, 11, 8, 5
//        int[] result = new int[array1.length + array2.length];
//
//        for (int index = 0; index < array1.length; index++) {
//            result[index] = array1[index];
//        }
//
//        for(int i = 0; i < array2.length; i++) {
//            result[i + array1.length] = array2[i];
//        }
//        System.out.println(taskForArrays.toString(result));

        // поділ масиву цілих чисел, на масив додатніх та масив з відʼємних чисел
        int[] array = {9, -2, -5, 6, -4, 3, 8, 1};
        // 9 6 3 8 1        -2, -5, -4
        int countNegativeNumbers = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                countNegativeNumbers++;
            }
        }
        System.out.println(countNegativeNumbers);

        int[] positiveNumbers = new int[array.length - countNegativeNumbers];
        int[] negativeNumbers = new int[countNegativeNumbers];
        int positiveNumbersIndex = 0;
        int negativeNumbersIndex = 0;


        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                negativeNumbers[negativeNumbersIndex] = array[i];
                negativeNumbersIndex++;
            } else {
                positiveNumbers[positiveNumbersIndex] = array[i];
                positiveNumbersIndex++;
            }
        }

        System.out.println(java.util.Arrays.toString(positiveNumbers) + " " + java.util.Arrays.toString(negativeNumbers));
    }
}
