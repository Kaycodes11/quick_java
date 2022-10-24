package recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6};
        System.out.println(search(arr, 4, 0, arr.length - 1));

    }

    // the value needed in future recursion, put / take them as parameter
    // make sure to return recursive call if it has return type like this function
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1; // base case

        // this is the variable created within this function's local environment
        // the value needed for only current recursive call, defined them like below
        int m = s + (e - s) / 2;
        if (arr[m] == target) return m;
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
