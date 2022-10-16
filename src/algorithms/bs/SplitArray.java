package algorithms.bs;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

//        binary search
        while (start < end) {
//            try for middle as potential ans
            int mid = start + (end - start) / 2;
//            calculate how many place you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
//                    you can't add this in this subarray, make new one
//                    say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start and end are same
    }
}

// first understand problem solve it on notebook (now could copy and paste the solution if stuck for around 40 min)
// after a week solve the same question from the written concept on the notebook [ try not to copy and paste now ]

// try to do new questions and repeat the previous two steps
// now, try to rewrite / optimize (like for loop to recursion)