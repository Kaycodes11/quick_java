import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main (String[] args) {
//        String[] studentsName = new String[25]; // value can be assigned from 0-24
//        studentsName[0] = "John";
//        studentsName[24] = "Jones";
//        System.out.println(studentsName[24]);

//        ArrayList<String> studentsName = new ArrayList<>();
//        studentsName.add("John");

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4); // this adds 4 to the end of the list
        System.out.println(list);

        list.add(1, 50); // insert element at the given index
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(45000);
        newList.add(50000);
        list.addAll(newList); // takes value from newList & add it to end of the list
        System.out.println(newList);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1); // mutates, remove the element from list
        System.out.println(list);
        list.remove(Integer.valueOf(50000)); // // mutates, remove the element from list if the value is unique
        System.out.println(list);
//        list.clear();
        System.out.println(list);
        list.set(2, 21);
        System.out.println(list);

        System.out.println(list.contains(4));
        System.out.println(list.contains(-4));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Integer element: list) {
            System.out.println("forEach element is " + element);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }




    }
}
