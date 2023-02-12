package Strings;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) { // third letter -> A, if word.length < 3 -> doesn't change
        String[] arr = {"Serg", "Max", "Bohdan", "Vlad", "Ann"};
        // Sera, Max, Bohaan, Vlaa, Ann
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 3){
                sb = new StringBuilder(arr[i]);
                sb.setCharAt(3, 'a');
                arr[i] = sb.toString();
            }
        }
//        System.out.println(Arrays.toString(arr));

    }
}
