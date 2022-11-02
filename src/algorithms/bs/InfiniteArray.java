package algorithms.bs;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 120, 140, 150, 180};
        System.out.println(ans(arr, 10));
    }

    // find position of the element from a sorted infinite array
    // length is unknown since arr is infinite thus arr.length can't be used
    static int ans(int[] arr, int target) {
        // first find the range
        // start with a box of size 2 from arr so 0, 1
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // newStart
            // double the box value
            end = end + (end - start + 1) * 2; // 1 + (( 1 - 0 + 1) * 2) = 5
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // element found
                return mid;
            }
        }
        return -1;
    }
}
