package recursion;

public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes a number and print it
        print1(1);
    }

    // it helps to solve bigger/complex problems in a simple way, you can convert recursion to iterative solution
    // space complexity is not constant because of recursive

    // when required to use same steps again and again to reach solution, then just use recursion
    // parameter, return type and variable created/used within function's local environment
    static void print1(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        // this is the last function call
        // tail recursion : when recursive call is last statement within function
        print1(n + 1);
    }
}
