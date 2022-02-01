package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithStrings {
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
        sortWithLastCharacter(list);

        System.out.println();
        getCharAndLengt(list);

        System.out.println();
        removeLessThan5(list);

        System.out.println();
        System.out.println(isLengthGreaterThen3(list));// false because there is 1 element its length smaller than 3
        System.out.println();
        System.out.println(checkAnyLength(list));// true
        System.out.println();
        System.out.println(checkNoLength(list));


    }

    //TODO: Create a method to print ist elements which are starting with "A" in Uppercase

    public static void aElements(List<String> list) {
        list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t.toUpperCase() + " "));
    }

    //TODO: Create a method to print ist elements which are starting with "A"  ending with "o" in lovercase
    public static void aOElements(List<String> list) {
        list.stream().filter(t -> t.startsWith("A") || t.endsWith("o")).map(t -> t.toLowerCase()).forEach(t -> System.out.println(t + " "));
    }
    //TODO: Create a method to print list elements in uppercase's after ordering according to their lengths

    //note: sorted method puts element in natural order
    public static void sortWithLength(List<String> list) {
        list.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t -> System.out.print(t + " "));
    }

    //TODO: Create a method to print list elements in lowercase's after ordering according to their last character
    public static void sortWithLastCharacter(List<String> list) {
        //list.stream().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(t-> System.out.print(t + " "));

        list.stream()
                .map(t -> t.toLowerCase())
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .forEach(t -> System.out.print(t + " "));
    }
    //TODO: Create a method to print the length of every element

    public static void getCharAndLengt(List<String> list) {
        list.stream().sorted(Comparator.comparing(t -> t.length())).map(t -> t + ":" + t.length()).forEach(t -> System.out.print(t + " "));
    }

    //TODO: Create a method to remove the element if the length is less than 5

    public static void removeLessThan5(List<String> list) {
        list.stream().filter(t -> t.length() >= 5).forEach(t -> System.out.print(t + " "));
    }

    public static void removeGreaterThan5(List<String> list) {
        list.stream().filter(t -> t.length() >= 5).forEach(t -> System.out.print(t + " "));
    }

    //TODO: Create a method to check if the length of all elements are grater then 3

    public static boolean isLengthGreaterThen3(List<String> list) {
        return list.stream().allMatch(t -> t.length() > 3);

    }
    //TODO: Create a method to check if the length of any element is 4

    public static boolean checkAnyLength(List<String> list) {
        return list.stream().anyMatch(t -> t.length() == 4);
    }

    //TODO:  Create a method to check if no element has length 11
    public static boolean checkNoLength(List<String> list) {
        return list.stream().noneMatch(t -> t.length() == 11);
    }
}
