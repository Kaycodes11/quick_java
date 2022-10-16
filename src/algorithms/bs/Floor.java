package algorithms.bs;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(floor(arr, 1));
    }

    // return index of the greatest no <=  target or return -1
    public static int floor(int[] arr, int target) {
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
        return end;
    }
}
