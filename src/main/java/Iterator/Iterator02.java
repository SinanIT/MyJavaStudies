package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        System.out.println(list);

        //add ! at the end of every element
        ListIterator<String> it1 = list.listIterator();
        while (it1.hasNext()) {
            String element = it1.next();
            it1.set(element + "!");
        }
        System.out.println(list);


        List<String> list2 = new ArrayList<>();
        list2.add("XY");
        list2.add("ZT");
        list2.add("UV");
        System.out.println(list2);

        //TODO:PRINT LIST ELEMENTS ONE BY ONE IN REVERSE ORDER BY PUTTING SPACE BETWEEN TWO ELEMENTS
        ListIterator<String> it2 = list2.listIterator();
        //take the pointer to the end
        while (it2.hasNext()) {
            it2.next();
        }
        while (it2.hasPrevious()) {
            String el = it2.previous();
            System.out.print(el+ " ");
        }

    }
}
