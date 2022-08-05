package CollectionsDetailed.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        // declaration
        //1-
        LinkedList linkedList = new LinkedList(); // can hold hetro genius data
        //LinkedList<Integer> nums = new LinkedList<>();// can hold homo genius data
        linkedList.add(5);
        linkedList.add("String");
        linkedList.add(true);
        linkedList.add(99.9);
        linkedList.add('A');
        linkedList.add(null);
        System.out.println(linkedList); //[5, String, true, 99.9, A, null]
        System.out.println(linkedList.size()); //6

        linkedList.remove(1);
        System.out.println(linkedList); // [5, true, 99.9, A, null]

        linkedList.add(1, "New String");
        System.out.println(linkedList); // [5, New String, true, 99.9, A, null]

        System.out.println(linkedList.get(3)); // 99.9

        linkedList.set(3, 100.99);
        System.out.println(linkedList); //[5, New String, true, 100.99, A, null]

        System.out.println(linkedList.getFirst()); // 5

        //
        System.out.println("reading linked list with for loop");
        for (int i = 0; i<linkedList.size(); i++){
            System.out.print(linkedList.get(i) + " "); // 5 New String true 100.99 A null
        }
        System.out.println("\nreading linked list with for each loop");

        for (Object obj : linkedList) {
            System.out.print(obj + " "); //5 New String true 100.99 A null
        }

        System.out.println("\nreading linked list with iterator");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " "); // 5 New String true 100.99 A null
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(1);
        numbers.add(19);
        numbers.add(21);
        numbers.add(30);
        numbers.add(16);

        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.addAll(numbers);

        System.out.println(numbers2);// [2, 13, 1, 19, 21, 30, 16]
        numbers2.removeAll(numbers2);
        System.out.println(numbers2);//[]

        numbers.addFirst(1000);
        numbers.addLast(2000);
        System.out.println( numbers);// [1000, 2, 13, 1, 19, 21, 30, 16, 2000]

        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 13, 16, 19, 21, 30, 1000, 2000]

        //reverse order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers); //[2000, 1000, 30, 21, 19, 16, 13, 2, 1]

        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 13, 16, 19, 21, 30, 1000, 2000] random result after each execution




    }
}
