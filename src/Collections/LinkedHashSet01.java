package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lHs = new LinkedHashSet<>();
        lHs.add(31);
        lHs.add(22);
        lHs.add(6);
        lHs.add(null);
        System.out.println(lHs.hashCode());//59
        System.out.println(lHs);//[31, 22, 6, null]


        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.add("A");
        lhs1.add("B");
        System.out.println(lhs1);

        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        lhs2.add("A");
        lhs2.add("C");
        lhs2.add("B");
        lhs2.add("X");


        System.out.println(lhs1.hashCode());//1814818341

        //Of you want to get common elements from two collections, use retainAll()
        System.out.println(lhs2.retainAll(lhs1));//true
        System.out.println(lhs2);



    }
}
