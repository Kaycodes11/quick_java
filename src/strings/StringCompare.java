package strings;

import java.util.Arrays;

public class StringCompare {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";

        // "==" checks whether the value and reference are same
        System.out.println(a == b); // due to use string pool makes b points to a thus true

        //  to explicitly make a String outside the string pool but within the heap
        String name1 = new String("Jones");
        String name2 = new String("Jones");

        System.out.println(name1 == name2); // now it's two separate objects thus false

        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
        System.out.println(Arrays.toString(new int[]{11, 10}));

        // Integer num = 40000;
        // System.out.println(num.toString());
    }

}
