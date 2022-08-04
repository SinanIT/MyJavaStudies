package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String > linkedList1 = new LinkedList<>();
        LinkedList<String > linkedList2 = new LinkedList<>();
        linkedList1.add(0, "B");
        linkedList1.add(0, "A");
        linkedList1.add("C"); //added element to the end

        linkedList2.add("!");
        linkedList2.add("?");

        linkedList1.addAll(linkedList2);
        System.out.println(linkedList1);//[A, B, C, !, ?]

        linkedList1.addAll(1, linkedList2);
        System.out.println(linkedList1);//[A, !, ?, B, C, !, ?]

        linkedList1.addFirst("X");//comes from queue
        linkedList1.addLast("Q");//comes from queue
        System.out.println(linkedList1);//[X, A, !, ?, B, C, !, ?, Q]

        System.out.println(linkedList1.element());//X-  returns first element. comes from queue. If the list isEmty throws NoSucAnElementExceptions
        System.out.println(linkedList1.peek());//X- returns first element. comes from queue. Returns Null is the list is empty

        System.out.println(linkedList1.getFirst());//X- returns first element. comes from queue. If the list isEmty throws NoSucAnElementExceptions

        System.out.println(linkedList1.getLast());//X- returns first element. comes from queue. If the list isEmty throws NoSucAnElementExceptions

        linkedList1.poll();//Retrieves and removes first element of the list. Return null if list is empty
        System.out.println(linkedList1);//[A, !, ?, B, C, !, ?, Q]

        System.out.println(linkedList1.offer("Y"));//Add the element to the tail, return boolean// true
        System.out.println(linkedList1);//[A, !, ?, B, C, !, ?, Q, Y]




    }
}
