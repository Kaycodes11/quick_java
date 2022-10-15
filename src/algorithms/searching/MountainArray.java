package algorithms.searching;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2}; // mountain array, increasing value 0, 2 then decreasing 1, 0
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
                // this is why end != 1
                end = mid;
            } else {
                // at the ascending side of array
                start = mid + 1;
            }
        }
        // in the end , start == end and pointing to the largest value because of 2 checks above
        // start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to just one element, that's the max one because that's what checks says
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that's the best possible answer
        return start; // or end as start and end both are same
    }
}
