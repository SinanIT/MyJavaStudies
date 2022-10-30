package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);

        //  TODO: multiply just first 3 elements ny to- print list 3 element reverse-

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int el = iterator.next();
//            if (iterator.nextIndex()>3){
//               continue;
//            }
            if (iterator.nextIndex() < 3) {
                iterator.set(el *= 2);
            }

        }
        System.out.println(list);
        System.out.print("Reverse order of list is :");
        while (iterator.hasPrevious()) {
            int el = iterator.previous();
            System.out.print( " " + el );
        }


    }
}
