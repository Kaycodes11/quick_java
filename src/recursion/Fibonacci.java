package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println(ans);
    }



    // https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=26&ab_channel=KunalKushwaha
    // watch explanation from 1.01.00 - 1.10.02


    static int fib(int n) {

        if (n < 2) {
            return n;
        };
        return fib(n - 1) + fib(n - 2);
    }
}
