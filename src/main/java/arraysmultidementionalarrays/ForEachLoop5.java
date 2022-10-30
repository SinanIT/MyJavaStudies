package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachLoop5 {

    //remove repeated elements from list
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("d");
        strings.add("c");
        strings.add("a");
        strings.add("e");
        strings.add("d");
        strings.add("c");
        strings.add("b");
        strings.add("e");
        strings.add("c");
        List<String> distinctList = new ArrayList<>();

        for (String x : strings) {
            if (distinctList.contains(x)) {
                continue;
            }
            distinctList.add(x);
        }
        Collections.sort(distinctList);
        System.out.println(distinctList);
    }
}
