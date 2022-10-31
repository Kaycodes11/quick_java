package LinkedList;


public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(2);
//        list.insertFirst(4);
//        list.insertFirst(6);
//        list.insertFirst(8);
//        list.insertLast(10);
//        list.insertAt(11, 2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        DL dl = new DL();
//        dl.insertFirst(2);
//        dl.insertFirst(4);
//        dl.insertFirst(6);
//        dl.insertFirst(8);
//        // dl.displayRev();
//        dl.display();
//        dl.insertLast(10);
//        dl.insert(8, 65);
//        dl.display();

        CL cl = new CL();
        cl.insert(23);
        cl.insert(3);
        cl.insert(19);
        cl.insert(75);
        cl.delete(23);
        cl.delete(75);
        cl.display();

    }
}
