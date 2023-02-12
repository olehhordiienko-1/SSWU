package VarArgs;

public class Handler {
    public static void main(String[] args) {
        int[] x = {6,7,2,5,9};
        display(x);
        System.out.println();
        displayVarArgs(8, 1, 3, 4, 5, 16);
    }

    static void display(int[] x) {
        for(int i : x) {
            System.out.print(i + " ");
        }
    }

    static void displayVarArgs(int...x) {
        for(int i : x) {
            System.out.print(i + ", ");
        }
    }
}
