package algorithms.searching;

//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        System.out.println(search(arr, 3));
    }

     static int search(int[] arr, int target) {
         int peak = peakIndexMountainArray(arr);
         int firstTry = binarySearchOrderAgnostic(arr, target, 0, peak);
         if(firstTry != 1) {
             return firstTry;
         }
         // try to search in second half
         return binarySearchOrderAgnostic(arr, target, peak + 1, arr.length - 1);
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

    public static int binarySearchOrderAgnostic(int[] arr, int target, int start, int end) {
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
