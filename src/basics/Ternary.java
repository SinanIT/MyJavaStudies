package basics;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers");
        int a = scan.nextInt();
        int b= scan.nextInt();
        int result = a>b ? a : b;
        System.out.println(result);
        String result1 = a%2==0 ? "Even":"Odd";
        System.out.println(result1);


    }
}