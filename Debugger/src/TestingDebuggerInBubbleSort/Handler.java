package TestingDebuggerInBubbleSort;

public class Handler {
    public static void main(String[] args) {
        Sorter sorter = arr -> {
            int temp = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        };

        int[] array = {3, 11, 93, 1, 8, 2, 23, 14, 0};
        sorter.sorting(array);
    }
}

interface Sorter {
    int[] sorting(int[] arr);
}