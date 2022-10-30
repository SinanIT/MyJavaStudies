package HackerRankQuestions.rank;

import java.util.Scanner;

public class JavaEndOfTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // line number
        int i =  1;
        // print all lines with line number
        while (scanner.hasNext()){
            System.out.println(i + " " + scanner.hasNextLine());
        }
        scanner.close();
    }
}
