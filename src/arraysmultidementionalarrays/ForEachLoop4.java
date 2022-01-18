package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop4 {
    //Create two list
    // print common elemenets
    //

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(14);
        list2.add(11);
        list2.add(15);
        list2.add(17);
        List<Integer> commonElements = new ArrayList<>();

        for (int w : list1) {
            for (int t : list2) {

                if (w == t) {
                    if (!commonElements.contains(w)) {
                        commonElements.add(w);
                    }
                }
            }
        }
        System.out.println(commonElements);

    }
}
