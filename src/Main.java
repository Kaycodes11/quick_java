import java.util.Scanner;

public class Main {
    public static int getSum (int first, int second) {
        return (first + second) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Hello java");
        // int, float, double, string, number, char, boolean

        int age = 11;
        float averageMarks = 44.44f;
        char grade = 'A';
        String name = "Goku";
        boolean isValid = false;
        long bigNumber = 9874564123121321l;
        // System.out.println(name);

        // +, - , / , * , % , ++, --

        int firstNumber = 12;
        int secondNumber = 10;
        double sum = (double) firstNumber % (double) secondNumber;
        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        // System.out.println(sum);
        // System.out.println(add);
        // System.out.println(sub);
        // System.out.println(multiply);
        // System.out.println(divide);

        // taking the user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age here: ");
        // int age_ = sc.nextInt();
        // float age_ = sc.nextFloat();
        // System.out.println(age_);
        // String name_ = sc.nextLine();
        // System.out.println(name_);

        // control flow > < >= <= != == , && ||
        if (age > 12) {
            System.out.println("high schooled" + age);
        } else {
            System.out.println("elementary student " + age);
        }

        switch (grade) {
            case 'A':
                System.out.println("You have got a good grade");
                break;
            case 'B':
                System.out.println("You have nice grade");
                break;
            case 'C':
                System.out.println("You have ok grade");
                break;
            case 'D':
                System.out.println("You have passing grade");
                break;
            default:
                System.out.println("what the heck is this grade?");
        }

        // loops
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int  a = 5;
//        while (a < 5) {
//            System.out.println(a);
//            a++;
//        }
//        do {
//            System.out.println("here" + a);
//            a++;
//        } while (a < 5);

        // array
        int[] arr = new int[5]; // it just means this has array has length 5 with no value defined
        //  String[] strArr = new String[]{"zero", "two", "is", "a", "waifu"};

        int[][] twoD_array = {{1, 2}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + twoD_array[i][j]);
            }
        }

        arr[0] = 1000;
        arr[1] = 1010;
        arr[2] = 1020;
        arr[3] = 1040;
        arr[4] = 1060;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // function
        System.out.println("sum " + getSum(25000, 26000));
        // exception handling
        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
