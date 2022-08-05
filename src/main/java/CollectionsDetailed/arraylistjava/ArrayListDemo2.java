package CollectionsDetailed.arraylistjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        //adding this al to another array list
        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        System.out.println(al2);// [X, Y, Z, A, B, C]
        al2.removeAll(al2);
        System.out.println(al2); // []

        //sort an array list

        Collections.sort(al);// ascending order
        System.out.println(al); // [A, B, C, X, Y, Z]

        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al); // [Z, Y, X, C, B, A]

        //shuffling the elements
        Collections.shuffle(al);
        System.out.println(al);// returns random order each time



    }
}
