package lambda;

import java.util.List;

public class Utils {
    public static boolean checkToBeEven(int a){
        return a%2==0;
    }
    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }
    public static void printWithSpace(int a){
        System.out.print(a + " ");
    }
    public static int findSquares(int a){
        return a*a;
    }

}
