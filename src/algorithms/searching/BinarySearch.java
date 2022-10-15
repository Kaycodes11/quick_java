package algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(binarySearch(arr, 6));
        int[] arr_ = {90, 75, 18, 1, 2, 4, 5, 6, -1, -2};
        System.out.println(binarySearchOrderAgnostic(arr_, 2));
    }

    // find the target from this ascending sorted array return index or -1
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

    // find the target from this descending sorted array return index or -1
    //time:  O(log N) worst and best O(1), space O(1)
    public static int binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether sorted array in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) {
                    start = end - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    // target < arr[mid]
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
