package recursion;

public class LearnRecursion {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int productOfArray(int A[], int N) {
        if (N <= 0) return 1;
        return (productOfArray(A, N - 1) * A[N - 1]);
    }

    public static int recursiveRange(int num) {
        if (num <= 0) return 0;
        return num + recursiveRange(num - 1);
    }

    public static int fibonacci(int n) {
        // fibonacci sequence starts with 0, 1 and each subsequent number thereafter, is the sum of prev pair
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;
        /*
        recursive call: coming from the main invocation, it calls the left side recursive fn(1); reached the base case, return n & popped off
        recursive call: coming from the main invocation, it calls the left side recursive fn(2) now after the previous pop off it comes here and goes to right side & it sees the curren n = 2 and right side has n - 2 = 0; with that value it recursive call itself (right side) then it meets the base case thus return pos i.e. 0 so now left side = 1, right side 0; Return value = left + right = 1 & now it gets "fully popped" off
        recursive call: coming from the main invocation, it calls the left side recursive fn(3); after the previous pop off, same way as before goes to right side (n - 2 = 1), recursively call itself, reaches the base case returns value then left 1 + right 1; Return value = 2
        recursive call: coming from the main invocation, it calls the left side recursive fn(4), after the previous pop off, goes to right side (4 - 2 = 2) then it (right side) calls itself recursively, now since n = 2, so it goes to left and calls itself recursively left(n - 1 = 1) then as it reaches the base case so returns 1, with that left side is done, now it moves to right side ( n - 2 = 0) and it (right side) recursively calls itself then it reaches the base case returns 0; so left = 1, right = 0; Return value 1 + 0 = 1

        within main function execution: now within the function body after the main invocation, fn(5), first recursive calls the left side; then after the
        previous pop off it goes to right side (n - 2 = 3) then it (right side) recursively calls itself,
        and since n = 3 so it goes to left side & recursively call itself

        left side = recursive call left side( 2 - 1 = 1) = reached the base case Return value is  1 and now popped off
        left side = recursive call  left side( 3 - 1 = 2); it comes here after prev pop off and it goes to right side (n - 2 = 0) recursive calls itself returns 0, so Return value left side + right side; Return value = 1 + 0 = 1
        right side = right side recursive call (3 - 2 = 1) recursively calls itself, reached the base case returns 1

        main invocation: the function called with given argument (5)

         */
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfDigits(int n) {
        if (n == 0 || n < 0) return 0;
        // what's the given value when recursively calling? what to do after recursive call with that value assuming after entering fn it reached base case?
        // recursive argument = 1, 0 return 0 so 1 + 0 = 1 then 1 + 1 = 2
        return n % 10 + sumOfDigits(n / 10);

    }

    public static int power(int base, int exp) {
        // base case
        if (exp < 0) return -1;
        if (exp == 1 || exp == 0) return base;

        // recursive case: break it to smaller section
        return base * power(base, exp - 1);
    }

    public static int gcd(int a, int b) {
        // gcd is the largest integer that divides the numbers without a remainder
        // (8, 12) = the highest common divisor here is 4
        if (a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int decimalToBinary(int n) {
        if (n == 0 || n < 0) return 0;
        return n % 2 + 10 * decimalToBinary(n / 2);
    }

    public static String reverse(String str) {
        // java => ava => va => a => return str = a
        if (str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) return true;
        if (str.charAt(0) == str.charAt(str.length() - 1)) return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }

//    public boolean someRecursive(int[] arr, OddFunction odd) {
//        if (arr.length == 0 ) {
//            return false;
//        } else if (odd.run(arr[0]) == false) {
//            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
//        } else {
//            return true;
//        }
//    }

    public static char first(String str) {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }

    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterFirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterFirst + " ";
        }
        return capitalizeWord.trim();
    }
}
