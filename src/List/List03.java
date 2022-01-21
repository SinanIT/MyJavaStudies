package List;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        //how to remove repeated element

        List<Character> list1 = new ArrayList<>();

        list1.add('x');
        list1.add('y');
        list1.add('x');
        list1.add('y');
        list1.add('x');
        list1.add('z');
        list1.add('m');

        List<Character> list2 = new ArrayList<>();
        //for each
        for (Character w : list1) {
            if (!list2.contains(w)) {
                list2.add(w);
            }
        }
        System.out.println(list2);//[x, y, z, m]

        //for loop
        for (int i = 0; i < list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
            }
        }
        System.out.println(list2);//[x, y, z, m]


    }
}
