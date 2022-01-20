package Exceptions;


import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        System.out.println(getAge(-1));
        scanner.close();
    }
    public static int getAge(int age){
        try {
            if (age<0){
                throw new IllegalArgumentException();//how to trow explicit exception
                //if i need explicit exception I use throw
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Negativ values can not be used in ages ...");
        }

        return age;
    }
}
