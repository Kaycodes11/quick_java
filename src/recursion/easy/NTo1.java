package recursion.easy;

public class NTo1 {
    public static void main(String[] args) {
//        fun(5);
//        funRev(5);
//        funBoth(5);
        System.out.println(factorial(5));;
    }

    static void fun(int n) {
        if (n == 0) return;
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) return;
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) return;
        System.out.println(n); // from parameter
        funRev(n - 1);
        System.out.println(n); // from stack
    }

    static int factorial (int n) {
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
