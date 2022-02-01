package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List06 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(21);
        list1.add(32);
        list1.add(25);
        list1.add(90);

        List<Integer> list2 = new ArrayList<>();

        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(444);
        list2.add(555);

        //how to two list
        //addAll list1 will change
        //elements will be add to end
        list1.addAll(list2);
        System.out.println(list2);
        System.out.println(list1);

        // another addAll() we can add new lis to the specific index
        list1.addAll(2, list2);
        System.out.println(list1);

        //how to delete all elements from list2
//        list2.clear();
//        System.out.println(list2);

        //checkin l;sr1 contains all element of list2
        //returns true if the all elements of list2 exist in the  list1
        System.out.println(list1.containsAll(list2));

        //get the last index number any element from list
        System.out.println(list1.lastIndexOf(111));//10

        //remove all a list from inside the list1
        list1.removeAll(list2);
        System.out.println(list1);

        //
        //list1.removeIf(t->t>35);
        // System.out.println(list1);
        list1.removeIf(t -> t % 2 != 0);
        System.out.println(list1);

        //how to get a spesific part of a list
        //returning sub list
        System.out.println(list2.subList(1, 3));

        //how to convert list to array toArray()
        System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555]

        //how to convert array to list
        // when create a list by using array some features transfer to list. Arrays are not flexible in size so in this situation list will not be flexible in size.
        //the methods are not related with length can be used in list which are created from arrays
        Integer arr[] = {1, 2, 56, 79};
        List<Integer> list3 = new ArrayList<>();

        //List<Integer> list3 = Arrays.asList(arr);
        //System.out.println(list3);//[[I@58ceff1]
        //list3.remove(2);//UnsupportedOperationException
        //list3.clear();//UnsupportedOperationException
        //list3.set(1,63);
        System.out.println(list3);
        int i = 0;
        do {
            list3.add(arr[i]);
            i++;
        } while (i < arr.length);

        System.out.println(list3);

        //How to convert a List to an Array
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(11);
        list.add(8);

        System.out.println(list);//[12, 15, 11, 8]

        //In the code "new Integer[0]", data type depends on the data type of the list elements.
        //In the example, data type of the list elements is Integer because of that I used Integer
        Integer arr2[] = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr2));//[12, 15, 11, 8]
    }
}
