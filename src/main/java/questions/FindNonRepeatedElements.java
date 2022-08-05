package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindNonRepeatedElements {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(9);
        list.add(3);


        System.out.println("None Repeated Element/s : " + noneRepeatedElements(list));

        //second way
//        list.stream()
//                .filter(number -> Collections.frequency(list, number) == 1)
//                .collect(Collectors.toList()).stream().sorted().forEach(System.out::println);

        //Unique elements of the list
        //new HashSet<>(list).forEach(System.out::println);

    }

    public static List<String> noneRepeatedElements(List<Integer> list) {
        List<String> result = new ArrayList<>();
        String str = "";
        for (Integer w : list) {
            str += w;
        }
        System.out.println("Str: " + str);


        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.substring(i, i + 1)) == str.lastIndexOf(str.substring(i, i + 1))) {
                result.add(str.substring(i, i + 1));
            }
        }
        //Collections.sort(result);
        return result;
    }
}

