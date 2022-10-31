package stackqueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
