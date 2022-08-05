package CollectionsDetailed.hashset;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Set 1: " + set1); //[1, 2, 3, 4, 5]

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set 2 : " + set2);

        //union

//        set1.addAll(set2);
//        System.out.println("Union : " + set1); // Union : [1, 2, 3, 4, 5]

        //intersection
//        set1.retainAll(set2);
//
//        System.out.println("Intersection : " + set1); //Intersection : [3, 4, 5]


        //difference
//        set1.removeAll(set2);
//        System.out.println("Difference: " + set1);// Difference: [1, 2]

        //Subset
        System.out.println("Subset :" + set1.containsAll(set2)); //Subset :true


    }
}
