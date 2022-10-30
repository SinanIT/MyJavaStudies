package CollectionsDetailed.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        //HashSet<Integer> lSet = new HashSet<>();
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(100);
        lSet.add(200);
        lSet.add(300);
        lSet.add(400);
        lSet.add(500);
        System.out.println("Hashset: "+ lSet); // Hashset: [400, 100, 500, 200, 300]

        System.out.println("LinkedHashset: "+ lSet); //LinkedHashset: [100, 200, 300, 400, 500]


    }
}
