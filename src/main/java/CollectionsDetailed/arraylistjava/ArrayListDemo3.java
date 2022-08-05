package CollectionsDetailed.arraylistjava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        String [] arr = {"Dog", "Cat", "Elephant"};
        for (String value : arr){
            System.out.print(value + " "); // Dog Cat Elephant
        }
        //convert array to array list

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println("\n" + al); // [Dog, Cat, Elephant]



    }
}
