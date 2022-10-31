package stackqueue;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // LIFO or First In Last Out
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>(); // First in first out
//        queue.add(-2);
//        queue.add(-4);
//        queue.add(-6);
//        queue.add(-8);
//        queue.remove();
//        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(8);
        deque.add(9);
        deque.add(10);
        deque.add(11);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
