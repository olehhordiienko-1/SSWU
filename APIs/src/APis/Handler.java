package APis;

import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        String str = "Java Forever! Java Rules!";
        /////   length  /////
        // int strLength = str.length();
        // System.out.println(strLength);
        // System.out.println(str.length());

        /////   endsWith(String suffix), startsWith(String suffix)   /////
        // boolean ends = str.endsWith("ever!");
        // System.out.println(ends);
        // System.out.println(str.startsWith("Jav"));

        /////   charAt(int index)    /////
        // char letter = str.charAt(2);
        // System.out.println(letter);

        /////   indexOf     /////
        // System.out.println(str.indexOf("For", 6));

        ///// replace   /////
        // String newStr = str.replace("Java", "Python");
        // System.out.println(newStr);
        //System.out.println(str.replace('a', 'A'));

        ///// substring /////
        // String sub = str.substring(6, 9);
        // System.out.println(sub);

        /////    toLowerCase & toUpperCase  /////
        // System.out.println(str.toUpperCase());

        /////   split   /////
        String[] array = str.split(" ");
//        for(String temp : array) {
//            System.out.println(temp);
//        }
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        int[] x = {1, 7, 9, 4, 5, 7 ,9};
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        int value = Arrays.binarySearch(x, 12);
        System.out.println(value);
    }
}
