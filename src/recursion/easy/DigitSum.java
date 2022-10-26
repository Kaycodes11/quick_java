package recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans = digitSum(1342);
        System.out.println("answer " + ans);
    }
    static int digitSum (int n) {
        if(n == 0) return 0;
        System.out.println(n);
        // 1342 / 10 = 134; 134 / 10 = 13; 13 / 10 = 1; 1 / 10 = 0
        return (n % 10) + digitSum(n / 10);
    }
}
