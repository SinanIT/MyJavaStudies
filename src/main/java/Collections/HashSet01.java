package Collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet<Object> hSet = new HashSet();
        hSet.add("A");
        hSet.add(2);
        hSet.add("c");
        hSet.add("c");
        hSet.add(null);
        hSet.add(null);

        System.out.println(hSet);//[null, A, 2, c]

    }
}
