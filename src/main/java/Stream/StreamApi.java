package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 1, 10, 3, 5);
        Stream<Integer> data = nums.stream();
//        data.forEach(n -> System.out.println(n));
//        System.out.println(data.count());
//        Stream<Integer> sortedData= data.sorted();
//        System.out.println(sortedData);
        // map  create new data

        Predicate<Integer> pred = integer -> integer % 2 == 1;
        Function<Integer, Integer> func = integer -> integer * 2;


        int result = nums.parallelStream()
                .filter(pred)
                .map(func)
                .reduce(0, Integer::sum);
        System.out.println(result);

    }
}
