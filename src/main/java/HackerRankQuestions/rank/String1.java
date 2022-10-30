package HackerRankQuestions.rank;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        //find sum of length two strings
        System.out.println(A.length() + B.length());

        // check which string comes first in alphabetic order
        System.out.println(A.compareTo(B)> 0 ? "Yes" : "No");

        //Make upper case first character f two strings only
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));

    }
}
