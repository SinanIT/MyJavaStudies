package questions;

import java.util.Arrays;
import java.util.Scanner;

public class CountVovelsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aCounter=0;
        int eCounter=0;
        int iCounter=0;
        int oCounter=0;
        int uCounter=0;
        System.out.println("Enter a string to see how many vowels you used");
        String string = scanner.nextLine().toLowerCase().replaceAll(" ", "");
        String ch[] = string.split("");

        System.out.println(Arrays.toString(ch));
        for (String w : ch){
            switch (w) {
                case "a" :
                    aCounter++;
                    break;
                case "e":
                    eCounter++;
                    break;
                case "i":
                    iCounter++;
                    break;
                case "o":
                    oCounter++;
                    break;
                case "u":
                    uCounter++;
                    break;
            }
        }
        System.out.println("The number of a " + aCounter);
        System.out.println("The number of e " + eCounter);
        System.out.println("The number of i " + iCounter);
        System.out.println("The number of o " + oCounter);
        System.out.println("The number of u " + uCounter);

    }
}
