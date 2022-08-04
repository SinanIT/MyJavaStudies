package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithMethodReferenceString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");

        aElements(list);
        System.out.println();
        aOElements(list);
        System.out.println();
        sortWithLength(list);
        System.out.println();
        printLessThan5(list);
        System.out.println();
        System.out.println(removeIfLengthLessThenFive(list));
    }

        //TODO: Create a method to print ist elements which are starting with "A" in Uppercase
    public static void aElements(List<String> list) {
        list.stream().filter(Utils::startWithA).map(String::toUpperCase).forEach(Utils::printWithSpaceString);
    }

        //TODO: Create a method to print ist elements which are starting with "A"  ending with "o" in lovercase
    public static void aOElements(List<String> list) {
        list.stream().filter(t -> t.startsWith("A") || t.endsWith("o")).map(String::toLowerCase).forEach(Utils::printWithSpaceString);
    }

        /*TODO: Create a method to print list elements in uppercase's after ordering according to their lengths
           note: sorted method puts element in natural order
        */
    public static void sortWithLength(List<String> list) {
        list.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(Utils::printWithSpaceString);
    }
        //TODO: Create a method to remove the element if the length is less than 5
    public static void printLessThan5(List<String> list) {
        list.stream().filter(t -> t.length() >= 5).forEach(Utils::printWithSpaceString);
    }
    //TODO: Create a method to remove the element if the length is less than 5
    public static List<String> removeIfLengthLessThenFive(List<String> list){
         list.removeIf(t->t.length()<5);
        return list;
    }
}
