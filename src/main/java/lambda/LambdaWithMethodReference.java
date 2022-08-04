package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithMethodReference {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(7);

        printEvenFuntional(list);
        System.out.println();
        printSquaresOfOdds(list);
        System.out.println();
        System.out.println(sumOfSquaresOfEvens(list));
        System.out.println();
        System.out.println(productCubeOfOdds(list));


    }
    //TODO: Create a method to print even list elements on the console in same line with a space between two consecutive elements In Functional Programming

    public static void printEvenFuntional(List<Integer> l) {
        l.stream().filter(Utils::checkToBeEven).forEach(Utils::printWithSpaceInt);
    }

    //TODO: create a method to print the square of odd list elements
    public static void printSquaresOfOdds(List<Integer> l) {
        l.stream().filter((Utils::checkToBeOdd)).map(Utils::findSquares).forEach(Utils::printWithSpaceInt);
    }

    //TODO: create a method to calculate sum of the squares of distinct even list elements
    public static int sumOfSquaresOfEvens(List<Integer> l) {
        int sum = l.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquares).reduce(0, Math::addExact);
        return sum;
    }

    //TODO: create a method to calculate the product of the cubes of distinct odd list elements
    public static int productCubeOfOdds(List<Integer> l) {
        int prod = l.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::findCube).reduce(1, Math::multiplyExact);
        return prod;
    }
}
