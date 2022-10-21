package strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + '2'));
        System.out.println("a" + 1);
        System.out.println("John" + new ArrayList<>());
        System.out.println("Jones" + new Integer(50));
        System.out.println(new Integer(40) + "" + new ArrayList<>());
    }
}
