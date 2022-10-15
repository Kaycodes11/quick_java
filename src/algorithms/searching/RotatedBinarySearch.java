package algorithms.searching;

//https://leetcode.com/problems/search-in-rotated-sorted-array/

// 2:38:00 - 2:52:46; 3:02:24 - 3:06:04, 3:09:42 -
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if pivot not found then it means array is not rotated
        if (pivot == -1) {
            // so then just do normal binary search on this non-rotated sorted array
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, then here have 2 sorted arrays
        if(nums[pivot] == target) return pivot;
        if(target >= nums[0]) return binarySearch(nums, target, 0, pivot - 1);
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    public static int binarySearch(int[] arr, int target, int start, int end) {
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
        return -1;
    }

    // this will not work with if arr has duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            // if elements at middle same as start, end then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skipping duplicates
                // NOTE: what if these elements at start and end were the pivot?
                // check if the start is pivot
                if(arr[start] > arr[start + 1]) return start;
                start++;
                // check if the start is pivot
                if(arr[end] < arr[end - 1] ) return end - 1;
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
