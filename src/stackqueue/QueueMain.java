package stackqueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(2);
//        queue.insert(4);
//        queue.insert(6);
//        queue.insert(8);
//        queue.insert(18);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();

//        CircularQueue queue = new CircularQueue(5);
//        queue.insert(2);
//        queue.insert(4);
//        queue.insert(6);
//        queue.insert(8);
//        queue.insert(10);
//
//        queue.display();
//         System.out.println(queue.remove());
//        queue.insert(12);
//        queue.display();


        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(2);
        queue.insert(4);
        queue.insert(6);
        queue.insert(8);
        queue.insert(10);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(12);
        queue.display();



    }
}
