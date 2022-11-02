package arrays.rotations;


//https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/
public class FindMultiLeftRotations {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int n = arr.length;

        int k = 2;
        leftRotate(arr, n, k);
        System.out.println();

        k = 3;
        leftRotate(arr, n, k);
        System.out.println();

        k = 4;
        leftRotate(arr, n, k);
        System.out.println();
    }

    public static void leftRotate(int[] arr, int n, int k) {
        // print array after k rotations
        for (int i = k; i < k + n; i++) {
            System.out.print(arr[i % n] + " ");
        }
    }
}
