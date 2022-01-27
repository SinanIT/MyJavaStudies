package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaWithInt {

    //TODO: Create a programming to print even list elements on the console in same line with a space between two consecutive elements In Structured Programming
    //Do same in functional programming
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        printEvenStructured(l);
        System.out.println();
        printEvenFuntional(l);
        System.out.println();
        printSquaresOfOdds(l);
        System.out.println();
        printDistinctSquaredOfOdds(l);
        System.out.println();
        System.out.println(sumOfSquaresOfEvens(l));
        System.out.println();
        System.out.println(productCubeOfOdds(l));
        System.out.println();
        System.out.println(maxOfList1(l));
        System.out.println();
        System.out.println(maxOfList2(l));
        System.out.println();
        System.out.println(minOfList1(l));
        System.out.println();
        System.out.println(minOfList2(l));

    }

    public static void printEvenStructured(List<Integer> l) {
        for (Integer w : l) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }
    //TODO: Create a method to print even list elements on the console in same line with a space between two consecutive elements In Funtional Programming

    public static void printEvenFuntional(List<Integer> l) {
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //TODO: create a method to print the square of odd list elements
    public static void printSquaresOfOdds(List<Integer> l) {
        l.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //TODO: create a method to print the cube of distinct odd list elements
    public static void printDistinctSquaredOfOdds(List<Integer> l) {
        l.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //TODO: create a method to calculate sum of the squares of distinct even list elements
    public static int sumOfSquaresOfEvens(List<Integer> l) {
        int sum = l.stream().filter(t -> t % 2 == 0).distinct().map(t -> t * t).reduce(0, (x, y) -> x + y);
        return sum;
    }

    //TODO: create a method to calculate the product of the cubes of distinct odd list elements
    public static int productCubeOfOdds(List<Integer> l) {
        int prod = l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).reduce(1, (x, y) -> x * y);
        return prod;
    }

    //TODO: create a method to calculate max list element
    public static Optional<Integer> maxOfList1(List<Integer> l) { // if you use just Lambda Expression in reduce() method return type will be Optional<>
        return l.stream().reduce((x, y) -> x > y ? x : y);
    }

    public static Integer maxOfList2(List<Integer> l) {
        return l.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y); //if you use 2 parameters in educe() method return type will not be optional
    }

    //TODO: create a method to calculate min list element
    public static Optional<Integer> minOfList1(List<Integer> l) {
        return l.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static Integer minOfList2(List<Integer> l) {
        return l.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
    }
}
