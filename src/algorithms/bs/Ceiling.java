package algorithms.bs;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 10, 12, 16};
        System.out.println(ceiling(arr, 11));

    }

    // return the index of >= target or ceiling of a number
    public static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1;
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
