package algorithms.sorting;

// pattern is = cyclic sort
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; // arr[arr[i]]
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for the mission number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) return index;
        }
        // case 2
        return arr.length;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
