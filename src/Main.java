import static recursion.LearnRecursion.*;

public class Main {
    public static void main(String[] args) {
        var rec = factorial(5);
        System.out.println(rec);
        var fib = fibonacci(10);
        System.out.println(fib);
        var sum = sumOfDigits(11);
        System.out.println(sum);
        var po = power(2, 4);
        System.out.println(po);
        var g = gcd(120, 12);
        System.out.println(g);
        var decToBin = decimalToBinary(10);
        System.out.println(decToBin);
        var reverseString = reverse("java");
        System.out.println(reverseString);
    }
}
