package ForEach;

public class Handler {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] ++;
//            System.out.println(arr[i]);
//        }

        for(int temp : arr) {
            temp++;
            System.out.println(temp);
        }
    }
}
