package lambda;

import java.util.stream.IntStream;

public class LambdaForForLoop {
    public static void main(String[] args) {
        print1to100(1, 50);
        System.out.println();
        print1to100InFunc(1, 50);
        System.out.println();
        System.out.println(sumOfInt(3, 98));
        System.out.println();
        System.out.println(sumOfEvenInt(3, 98));
        System.out.println();
        System.out.println(multipOfOddInt(3, 15));
        System.out.println();
        System.out.println(findFactorial(9));
        System.out.println();
        System.out.println(findEvenProd(7));
        System.out.println();
        System.out.println(findOddSum(23));
        System.out.println();
        System.out.println(findOddSumAfter6(5));

    }

    // Print all integers from 1 to 100 structured programming
    public static void print1to100(int starting, int ending) {
        System.out.print(starting + " ");
        starting++;
        if (starting < ending + 1) {
            print1to100(starting, ending);
        }
    }

    //functional programming
    public static void print1to100InFunc(int starting, int ending) {
        //IntStream.range(starting,ending+1).forEach(t-> System.out.print(t + " "));
        IntStream.rangeClosed(starting, ending).forEach(t -> System.out.print(t + " "));
    }

    //Find some of integers from 3 to 98 by using functional programming
    public static int sumOfInt(int starting, int ending) {
        return IntStream.rangeClosed(starting, ending).sum();
    }

    //find the sum of even int 3, 98
    public static int sumOfEvenInt(int starting, int ending) {
        return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeEven).sum();
    }

    // find multiplication of odd integers from 3 to 28
    public static int multipOfOddInt(int starting, int ending) {
        return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);
    }

    //Find 9! using functional programming
    public static int findFactorial(int num) {
        return IntStream.rangeClosed(1, num).reduce(1, Math::multiplyExact);
    }

    //find the multiplication of first 7 even number
    public static int findEvenProd(int num) {
       // return IntStream.rangeClosed(2, 2* num).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact); // OR
        return IntStream.iterate(2, t->t+2).limit(num).reduce(1, Math::multiplyExact);// this one better solution
    }

    // sum of firs 23 numbers find the
    public static int findOddSum(int num) {
        // return IntStream.rangeClosed(1, 2 * num).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact); // OR
        return IntStream.iterate(1, t->t+2).limit(num).sum();// this one better solution
    }

    public static int findOddSumAfter6(int num) {
        return IntStream.iterate(7, t->t+2).limit(num).reduce(1, Math::multiplyExact);
    }
}
