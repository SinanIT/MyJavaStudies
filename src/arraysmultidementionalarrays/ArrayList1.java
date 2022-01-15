package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        // ArrayLists are flexible in size
        //Array list con not store multiple types
        // ArrayList store non-primitive data types
        // ArrayList are updated version of Arrays

        //create an array list 1-
        ArrayList<Integer> list = new ArrayList<>();
        //to print an ArrayList use its name in SystemOut
        System.out.println(list);

        //adding elements to array list
        list.add(12);
        list.add(33);
        list.add(21);
        System.out.println(list);//[12, 33, 21]

        //adding element into a specific index
        list.add(1, 45);
        System.out.println(list);//[12, 45, 33, 21]
        Collections.sort(list);
        System.out.println(list);

        //get a specific element from arraylist
        System.out.println(list.get(2));
        //System.out.println(list.get(4));//run time error. IndexOutOFBounds


    }
}
