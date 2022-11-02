package algorithms.bs;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(floor(arr, 8));
    }

    // Floor in a sorted array
    // Given a sorted array & target, find out the element <= target
    /*
    Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 5
    Output: 2
    Explanation: 2 is the largest element in
    arr[] smaller than 5

    Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 20
    Output: 19
    Explanation: 19 is the largest element in
    arr[] smaller than 20

    Input : arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 0
    Output : -1
    Explanation: Since floor does not exist, output is -1.

 */

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
