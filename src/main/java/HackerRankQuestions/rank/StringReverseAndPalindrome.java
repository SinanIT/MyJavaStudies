package HackerRankQuestions.rank;

import java.util.Scanner;

public class StringReverseAndPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        // First
        String b = new StringBuilder(s).reverse().toString();
        if (s.equals(b)){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }
}
