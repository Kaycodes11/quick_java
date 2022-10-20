package algorithms.sorting;

// pattern is = cyclic sort
public class SetMismatch {
    public static void main(String[] args) {

    }

    static int[] findErrorNums(int[] arr) {
        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
