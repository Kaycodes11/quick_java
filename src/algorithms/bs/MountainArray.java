package algorithms.bs;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2}; // mountain array, increasing value 0, 10 then decreasing 5, 2
//        int[] arr = {0, 2, 4, 5, 2}; // mountain array, increasing value 0, 10 then decreasing 5, 2
        System.out.println(peakIndexMountainArray(arr));
    }

    public static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // if middle value right now is greater than next value then at the decreasing side
                // this could be the answer but look at the left
                end = mid;
            } else {
                // at the ascending side of array
                start = mid + 1;
            }
        }
        return end;
        // return start; // or end as start and end both are same
    }
}
