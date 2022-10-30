package HackerRankQuestions.rank;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
    public static boolean isAnagram(String a, String b) {
        // condition for anagram strings
        // first check is there any white space and case sensitivity
        a = a.replace(" ", "").toLowerCase();
        b = b.replace(" ", "").toLowerCase();

        // if thet are same number of elements its is anagram else not
        char [] c  = a.toCharArray();
        char [] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        if (Arrays.equals(c,d))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not anagrams");
    }


}
