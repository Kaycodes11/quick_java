package algorithms.ls;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    // find the minimum value from array
    static int min(int[] arr) {
        // assuming arr.length != 0
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
