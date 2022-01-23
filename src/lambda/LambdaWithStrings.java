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
        list.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));
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
        list.stream().sorted(Comparator.comparing(t -> t.length())).map(t -> t + ":" + t.length()).forEach(t-> System.out.print(t + " "));
    }

    //TODO: Create a method to remove the element if the length is less than 5

    public static void removeLessThan5(List<String> list){
        list.stream().filter(t->t.length()>=5).forEach(t-> System.out.print(t + " "));
    }
    public static void removeGreaterThan5(List<String> list){
        list.stream().filter(t->t.length()>=5).forEach(t-> System.out.print(t + " "));
    }
}
