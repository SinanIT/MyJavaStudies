package arraysmultidementionalarrays;

import java.util.Arrays;

public class Array03 {

    /*
    split() method used to split a String using specific character/s
    split() method puts the splitted parts into an array
     */
    public static void main(String[] args) {

        String s= "JavaGood";
        String arr [] = s.split("a");
        System.out.println(Arrays.toString(arr)); //[J, v, Good]

        String arr1[] = s.split("");
        System.out.println(Arrays.toString(arr1)); //[J, a, v, a, G, o, o, d]

        String str = "What a wonderful day today";
        String str1[] = str.split(" ");
        System.out.println(Arrays.toString(str1));
        System.out.println(str1.length);


    }
}
