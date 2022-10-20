package algorithms.ls;

public class EvenItems {
    public static void main(String[] args) {
        int[] arr = {12, 1, 245, 7812};
        System.out.println(digits(arr));
    }

    static int digits(int[] nums) {
        int count = 0;
        //  for (int num : nums) {
        //      if(even(num)) count++;
        //  }
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) count++;
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        return num % 2 == 0;
    }
}
