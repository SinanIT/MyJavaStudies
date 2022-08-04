package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {
        //List<String> list = List.of("A", "B", "C");
        //System.out.println(list);//[A, B, C]

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        // By using loop we can not update list
        for (String w : list) {
            w += w;
        }
        System.out.println(list);//[A, B, C]
        //Iterator not a class it is an interface. We always use iterator with while loop
        Iterator<String> it1 = list.iterator();//creating it1 object using by list object
        while (it1.hasNext()) {
            it1.next();
            it1.remove();
        }
        System.out.println(list);

    }
}
