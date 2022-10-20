package algorithms.ls;

public class LearnLinearSearch {
    public static void main(String[] args) {
        int[] nums = {11, 10, 5, 4};
        System.out.println(linearSearch(nums, 5));
        System.out.println(linearSearch2(nums, 10));
    }

    // search in the array : return the index if found else -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) return -1;
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) return i;
        }
        return -1;
    }

    // search array and return element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) return -1;
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) return element;
        }
        return -1;
    }

}
