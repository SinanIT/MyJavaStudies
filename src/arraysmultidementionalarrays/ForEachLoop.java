package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(13);
        list.add(15);
        list.add(12);
        list.add(14);
        System.out.println(list);
        // printing list elements 1-
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //2-
        for (Integer x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (Integer x : list) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        // if tou assign primitive int to wrapper class integer java automatically autoboxing
        // Integer to int is unboxing
        for (int x : list) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        for (int x : list) {
            if (x % 2 != 0) {
                continue;//skipps odd elements here
            }
            System.out.print(x + " ");
        }
        System.out.println();
        //printing last 3 elements each loop
        for (Integer x : list){
            if (list.indexOf(x)>=list.size()-3){
                System.out.print(x + " ");
            }

        }
        System.out.println();
        //second way to get last 3 elemenet from list
        for (Integer x : list){
            if (list.indexOf(x)<list.size()-3){
                continue;//skipping index number that smaller then the condition
            }
            System.out.print(x + " ");

        }
        System.out.println();
        // 3. way
        for (Integer w:list.subList(list.size()-3, list.size())){
            System.out.print(w + " ");
        }
        System.out.println();
        //print first 3 element
        //1-
        for (int x : list){
            if(list.indexOf(x)<3){
                System.out.print(x + " ");
            }
        }
        System.out.println();
        for (int x : list){
            if(list.indexOf(x)>2){
               break; // i didn't use continue because after index 2 we dont need to check rest of list elements. break go out the loop.
            }
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : list.subList(0,3)){
            System.out.print(x + " ");
        }

    }
}
