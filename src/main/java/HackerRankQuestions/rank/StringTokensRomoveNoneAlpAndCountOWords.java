package HackerRankQuestions.rank;

import java.util.Scanner;

public class StringTokensRomoveNoneAlpAndCountOWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s  = scanner.nextLine(); // He is a very very good boy, isn't he?
        scanner.close();
        s = s.trim();
        if (s.length() == 0){
            System.out.println(0);
        }
        String [] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String word : words){
            System.out.println(word);
        }
    }
}
