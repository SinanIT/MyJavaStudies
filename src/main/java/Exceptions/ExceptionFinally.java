package Exceptions;

public class ExceptionFinally {

    public static void main(String[] args) {
        div(4, 0);
    }

    public static void div(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Do not use zro for the secaond parameter..");

        } finally {
            System.out.println("Do you want to do more operations?");
        }
    }
}