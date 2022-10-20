package algorithms.ls;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(linearSearch(arr, 12, 1, 4));
    }

    // search target from array within given range (start, end)
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;
        // run a for loop
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) return i;
        }
        return -1;
    }
}
