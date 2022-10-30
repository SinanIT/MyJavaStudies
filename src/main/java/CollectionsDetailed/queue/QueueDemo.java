package CollectionsDetailed.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //
        PriorityQueue pQ = new PriorityQueue();

        //Adding elements  add() or offer(). Insertion order preserved and duplication is allowed
        pQ.add("A");
        pQ.add("B");
        pQ.add("C");
        pQ.add("D");
        pQ.add("D");

        System.out.println(pQ); //[A, B, C, D, D]

        //get head element element(), peek()

        System.out.println(pQ.element()); // A if queue empty returns ==> NoSuchElementException
        System.out.println(pQ.peek()); // A  if queue empty returns ==> null

        // return and remove element from queue remove() or poll

        //System.out.println(pQ.remove()); // return first element A then remove the element. if queue empty returns NoSuchElementException
        //System.out.println(pQ.poll()); // return first element A then remove the element if queue empty returns ==> null
       // System.out.println(pQ);// [B, D, C, D]

        // read elements
        Iterator it = pQ.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " "); // A B C D D
        }
        System.out.println();
        for (Object e:pQ) {
            System.out.print(e + " ");// A B C D D
        }


    }
}
