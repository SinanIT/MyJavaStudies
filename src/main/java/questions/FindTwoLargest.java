package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindTwoLargest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(3);
        list.add(11);
        list.add(8);

        System.out.println(maxTwo(list));//[11, 12]

        int[] A = { 6, 8, 3, 5, 1, 9 };

        List<Integer> ints = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Ints: "+ints);


    }

    public static List<Integer> maxTwo(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(list);// 3 7,8,11,12. Without sorting we can not get the result.
        try {
            if (list.get(0) * list.get(1) > list.get(list.size() - 2) * list.get(list.size() - 1)) {
                result.add(list.get(0));
                result.add(list.get(1));
            } else {
                result.add(list.get(list.size() - 2));
                result.add(list.get(list.size() - 1));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The list must have at least 2 elements");
        }
        return result;
    }

    public static void numArray(int number []){
        int max = Arrays.stream(number).max().getAsInt();
        System.out.println("MAz number is: "+max);

    }

    public static Integer getMax(List<Integer> list)
    {
        return list.stream()                        // Stream<Integer>
                .mapToInt(v -> v)               // IntStream
                .max()                          // OptionalInt
                .orElse(Integer.MIN_VALUE);     // Integer
    }

}
