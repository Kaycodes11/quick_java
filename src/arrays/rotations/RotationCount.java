package arrays.rotations;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotations(arr, 0, arr.length - 1));
        System.out.println(countRotations(arr, arr.length));
    }

    // Time Complexity: O(log N) Auxiliary Space: O(log N)  [this is the space of recursion stack]
    static int countRotations(int[] arr, int low, int high) {
        // low / start, high / end
        if (high < low) return 0;
        if (high == low) return low;
        int mid = low + (high - low) / 2;
        if (mid < high && arr[mid + 1] < arr[mid]) return (mid + 1);
        if (mid > low && arr[mid] < arr[mid - 1]) return mid;
        if (arr[high] > arr[mid]) return countRotations(arr, low, mid - 1);
        return countRotations(arr, mid + 1, high);

    }

    // Time Complexity: O(log N) Auxiliary Space: O(1)
    static int countRotations(int[] arr, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {

            // if first element is mid or
            // last element is mid
            // then simply use modulo so it
            // never goes out of bound.
            int mid = low + (high - low) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if (arr[mid] <= arr[prev]
                    && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] <= arr[high])
                high = mid - 1;
            else if (arr[mid] >= arr[low])
                low = mid + 1;
        }
        return 0;
    }

}
