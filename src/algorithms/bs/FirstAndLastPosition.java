package algorithms.bs;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7}; // int[] arr = {5, 7, 7, 8, 7, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 7)));
    }

    // given an array of integers; return first and second occurrences in an array
    static public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for the first occurrence of the target
        ans[0] = search(nums, target, true);
        // check for the second occurrence of the target
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // the potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

