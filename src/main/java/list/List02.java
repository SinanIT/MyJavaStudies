package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("F");
        list1.add("B");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("F");
        list2.add("B");
        list2.add("D");

        // How to check alist has a specific element contains(). return boolean
        System.out.println(list1.contains("B"));//true

        //how to check 2 lists equal or not
        // if same element in same index
        System.out.println(list1.equals(list2));//true

        // Ask user enter a letter
        // if the letter exist in list 1 convert (set) into "got it"
        //otherwise add the element which user entered into the list

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = scanner.next().toUpperCase().substring(0,1);

        if (list1.contains(letter)){
            list1.set(list1.indexOf(letter), "Got it");
            System.out.println(list1);
        }else{
            list1.add(letter);
            System.out.println(list1);
        }
        scanner.close();




    }
}
