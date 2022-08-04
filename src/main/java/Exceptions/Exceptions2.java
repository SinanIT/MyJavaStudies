package Exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        System.out.println(divide(6 ,2));
        System.out.println(divide(2, 6));
        System.out.println(divide(-8, 4));
        System.out.println(divide(-4, -8));
        System.out.println(divide(12, -6));
        System.out.println(divide(-3, -12));
        System.out.println(divide(0, 2));
        System.out.println(divide(4, 0));

    }
    public static int divide(int a, int b){

        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Do not use 0 for denominator");
        }
        return 0;
    }
}
