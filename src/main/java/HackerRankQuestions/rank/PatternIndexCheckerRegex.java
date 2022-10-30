package HackerRankQuestions.rank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternIndexCheckerRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases>0){
            String pattern = scanner.nextLine(); //([A-Z])(.+)  or [AZ[a-z](a-z) or batcatpat(nat

            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;

        }
        scanner.close();

    }
}
