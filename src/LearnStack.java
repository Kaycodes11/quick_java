import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Fox");
        animals.push("Dog");

        System.out.println("STACK " + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
