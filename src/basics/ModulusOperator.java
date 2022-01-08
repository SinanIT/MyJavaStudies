package basics;

import java.util.Scanner;

public class ModulusOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        int lastDigit= a%10;
        System.out.println(lastDigit);

        System.out.println(a);

        int num1= a/10;

        System.out.println(num1);
        int secondDigit = num1%10;
        System.out.println(secondDigit);
        System.out.println(a);
        int firstDigit= a/100;
        System.out.println(firstDigit);

        System.out.println(firstDigit+secondDigit+lastDigit);

    }
}
