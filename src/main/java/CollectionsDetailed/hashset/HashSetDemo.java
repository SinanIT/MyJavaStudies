package CollectionsDetailed.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        //declaration
        HashSet hs = new HashSet();// initial size/capacity 16 by default. Load factor 0.75. These two can be updated
        //HashSet<Integer> hs2 = new HashSet<>(100, (float) 0.90);

        hs.add(5);
        hs.add("String");
        hs.add(true);
        hs.add(99.9);
        hs.add('A');
        hs.add(null);
        System.out.println(hs); //[5, String, true, 99.9, A, null]
        System.out.println(hs.size()); //6

        hs.remove(1);
        System.out.println(hs); // [5, true, 99.9, A, null]


        System.out.println("\nreading HashSet with for each loop");

        for (Object obj : hs) {
            System.out.print(obj + " "); // null A 99.9 5 String true
        }

        System.out.println("\nreading HashSet with iterator");
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " "); // null A 99.9 5 String true
        }

        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(8);
        evenNumber.add(16);
        evenNumber.add(32);
        System.out.println("\nHashSet:"+ evenNumber); //HashSet:[16, 32, 2, 8]

        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(10);
        System.out.println("New HashSet: " + numbers); // New HashSet: [16, 32, 2, 8, 10]

        //removeAll()
        numbers.removeAll(evenNumber);
        System.out.println(numbers); // [10]



    }
}
