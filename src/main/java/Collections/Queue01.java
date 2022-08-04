package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("Ali");
        q1.add("Veli");
        q1.add("Can");
        q1.add("Mary");
        System.out.println(q1);

        q1.element();// returns the first element. No removing. If the PQ is empty it throws exception
        System.out.println(q1);//[Ali, Mary, Can, Veli]
        q1.peek();// Same as element(). If the PQ is empty returning null
        System.out.println(q1);//[Ali, Mary, Can, Veli]
        q1.poll();// Pool is doing cut and paste
        System.out.println(q1);//[Can, Mary, Veli]

        //Deque: Double ended queue
        Deque<String> dq1 = new LinkedList<>();


    }
}
