package arrays.rotations;

// program to rotate an array by d elements, time O(N) and space O(1)
public class RotateArray {

    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int arr[], int d, int n) {
        /* To handle if d >= n */
        // if rotation count / d = 4 but if the length = 2 then 4 % 2 = 0; 2 % 2 = 0
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n); // how many
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d; // 2
                if (k >= n) k = k - n;
                if (k == i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Function to get gcd of a and b*/
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void rotate(int[] arr, int d, int n) {
        int temp[] = new int[n]; // store the rotated version of array
        int k = 0;

        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // temp[] = {3, 4, 5, 6, 7}, k = 5

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // temp[] = {3, 4, 5, 6, 7, 1, 2}, k = 7

        // this loop could be optional
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void leftRotate2(int[] arr, int d) {
        if(d == 0) return;
        int n = arr.length;
        // in case rotating factor is greater than array length then
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void print2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }





    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        // time O(N) and space O(1)
        // rotate.leftRotate(arr, 2, arr.length);
        // rotate.printArray(arr, arr.length);

        // time O(N) and space O(1)
        leftRotate2(arr, 2);
        print2(arr);

        // time O(N) and space O(N)
        // rotate(arr, 2, arr.length);
        // print(arr, arr.length);
    }
}


