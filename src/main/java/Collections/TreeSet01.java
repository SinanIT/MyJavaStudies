package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet<Integer> tSet= new TreeSet<>();
        tSet.add(99);
        tSet.add(-15);
        tSet.add(3);
        tSet.add(78);
        System.out.println(tSet);//[-15, 3, 78, 99]

        //TODO: Create a collection whic has sorted unique elements
        // 1- Use TreeSet directly but this way will be very slow
        // 2- USe HashSet to create Collection then convert HashSet to TreeSet to put elements in order-Best way

       long statr1= System.currentTimeMillis();
        TreeSet<Integer> tSet1= new TreeSet<>();
        for (int i= 0; i<100000; i++){
            tSet1.add(2*i);
        }
        System.out.println("Tree set size " + tSet1.size());
        long end1= System.currentTimeMillis();
        System.out.println(end1- statr1);
        System.out.println();

        //second way
        long statr2= System.currentTimeMillis();
        HashSet<Integer> hasSet= new HashSet<>();
        for (int i= 0; i<100000; i++){
            hasSet.add(2*i);
        }
        TreeSet<Integer> tset3 = new TreeSet<>(hasSet);
        System.out.println(tset3.size());
        long end2= System.currentTimeMillis();
        System.out.println(end2- statr2);


    }
}
