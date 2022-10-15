package algorithms.searching;

public class SmallestLetter {
    public static void main (String[] args) {
        char[] arr = {'c', 'f', 'g'};
        System.out.println(nextGreaterLetter(arr, 'f'));
    }

    // find the smallest letter greater than target
     public static char nextGreaterLetter(char[] letters, char target) {
         int start = 0;
         int end = letters.length - 1;

         while (start <= end) {
             // find the middle element
             int mid = start + (end - start) / 2;
             if (target < letters[mid]) {
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         }
         return letters[start % letters.length];
     }
}


