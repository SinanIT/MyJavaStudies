package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(15);
        list.add(21);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
            }
        while (iterator.hasPrevious()){
            Integer num = iterator.previous();
            iterator.set(num+= 2);
            System.out.print(num+ " ");
        }
        System.out.println();
        System.out.println(list);
        System.out.println();
        Collections.reverse(list);
        System.out.println(list);

    }
}
