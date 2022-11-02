package arrays.rotations;

public class MaxSumByRotation {

    public static void main(String[] args) {
        int[] arr = {1, 20, 2, 10};
        // System.out.println(maxSum(arr));

        int[] arr2 = {8, 13, 1, 2};
        System.out.println(maxSum2(arr2, arr2.length));
    }

    static int findPivot(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) return i;
        }
        return 0;
    }

    // Time Complexity: O(N), Auxiliary Space: O(1)
    static int maxSum2 (int[] arr, int n) {
        int sum = 0;
        int i = 0;
        int pivot = findPivot(arr, n);
        int diff = n - 1 - pivot;
        for (i = 0; i < n; i++) {
            sum = sum + ((i + diff) % n) * arr[i];
        }
        return sum;
    }

    // Time Complexity: O(N), Auxiliary Space: O(1)
    static int maxSum(int[] arr) {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0; // Stores sum of arr[i]
        int currVal = 0; // Stores sum of i*arr[i]
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
            currVal = currVal + (i * arr[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j = 1; j < arr.length; j++) {
            currVal = currVal + arrSum - arr.length * arr[arr.length - j];
            if (currVal > maxVal) maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

}
