package strings;

public class LearnString {
    public static void main(String[] args) {
        // String has two main characteristics, string pool and immutability

        /* string pool is basically a separate memory location within heap where string value stored but most importantly
        like here where name2 has a value that already exist so the value won't be recreated rather taken from string pool
        by pointing name2 to name.

        so then if changes made to either name or name2 will it change the value for both since they uses same memory address?
        No, it won't do that here due to immutability

         */

        String name = "John";
        System.out.println(name);

        String name2 = "John";
        System.out.println(name2);

        String a = "Johnson";
        // value is not modified but rather assigned a new value
        a = "Jones";
        // new value has assigned so the previous value will be garbage collected


    }
}
