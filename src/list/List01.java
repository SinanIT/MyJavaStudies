package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1);

        //2 way
        //create an array list 2-

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(2);
        list2.add(19);
        list2.add(4);
        list2.add(71);
        list2.add(-3);

        System.out.println(list2);
        //find max and min
        Collections.sort(list2);
        System.out.println(list2);
        int min = list2.get(0);
        int max= list2.get(list2.size()-1);
        System.out.println("Min= " + min + " " + "Max= " + max);

        //is the list empty?
        System.out.println(list2.isEmpty());//false
        List<String> list3 = new ArrayList<>();
        System.out.println(list3.isEmpty());//true
        list3.add("19");
        list3.add("Mary");
        list3.add("School");
        list3.add("John");
        System.out.println(list3.isEmpty());//false

        //how to remove from an element from list by using index
        // this method will remove the element at index to, and will wil return removed element
        System.out.println(list2.remove(2));// will return 4
        System.out.println(list2);//[-3, 2, 9, 19, 71];

        //removing element by element value. For int we can NOT remove element by element value.
        System.out.println(list3);
        list3.remove("Mary");//[19, Mary, School, John]
        System.out.println(list3);//[19, School, John]

        //not recomended
        int idx =list3.indexOf("School");//return index number
        list3.remove("School");
        list3.add(idx, "University");
        System.out.println(list3);

        //update use set() it is used to update an element by index
        //returns previous element
        //[19, University, John]
        System.out.println(list3.set(list3.indexOf("University"), "College"));//previous element University
        System.out.println(list3);//[19, College, John]





    }
}
