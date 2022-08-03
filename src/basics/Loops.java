package basics;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //checkInitial();

        checkPassLength();

    }

    public static void checkInitial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = "";

        do {
            firstName = scanner.nextLine();
            if (firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z') {
                System.out.println("Your entry is correct");

            } else {
                System.out.println("Please make the initial uppercase...");

            }
        } while (!(firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z'));
        scanner.close();
    }

    public static void checkPassLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = "";
        do {
            password = scanner.nextLine();
            if (password.length() >= 6) {
                System.out.println("It is OK");
            } else {
                System.out.println("Password should be more then 6 characters");
            }
        } while (!(password.length() >= 6));
        scanner.close();
    }

}
