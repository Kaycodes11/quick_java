package algorithms.sorting;

import java.util.Arrays;

// sorted array O(n) else O(n square); space O(1)
public class LearnBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        // run the code n - 1 time
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the current item is smaller than previous element
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
