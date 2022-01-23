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
        list.add(15);

        printEvenFuntional(list);
        System.out.println();
        printSquaresOfOdds(list);

    }
    //TODO: Create a method to print even list elements on the console in same line with a space between two consecutive elements In Funtional Programming

    public static void printEvenFuntional(List<Integer> l) {
        l.stream().filter(Utils::checkToBeEven).forEach(Utils::printWithSpace);
    }

    //TODO: create a method to print the square of odd list elements
    public static void printSquaresOfOdds(List<Integer> l) {
        l.stream().filter((Utils::checkToBeOdd)).map(Utils::findSquares).forEach(Utils::printWithSpace);
    }

}
