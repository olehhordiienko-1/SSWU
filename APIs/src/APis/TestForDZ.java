package APis;

public class TestForDZ {
    public static void main(String[] args) {
       // 10. Given:

        int[ ] arr = {1,2,3,4};
        for ( int i : arr ){
            System.out.println(arr[i]);
            arr[i] = 0;
        }
        for ( int i : arr ){
            System.out.print(i + " ");
        }
//        A)  Prints 0 2 0 0
//        B)  Compile error
//        C)  Prints 0 1 2 3
//        F)  Prints 0 0 3 0
//
//        D)  Prints 0 0 0 0
//        E)  Runtime Exception occurs.
    }
}
