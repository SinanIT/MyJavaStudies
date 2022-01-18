package arraysmultidementionalarrays;

public class Varargs01 {
    public static void main(String[] args) {
        // If i wamt to a method to run with diffrent number of arguments use varargs
        //varags behaves like list but behind the varargs arrays work
        //To declare a varargs use "int...a" or "String... s" etc.
        //Varargs maust be the last parameter inside the method parenthesis
        //no multiple varargs

        System.out.println(add1(3, 5,9));
        String a="";
        a += 2;
        a +='c';
        a+=false;
        System.out.println(a);
        System.out.println(a=="2cfalse");//false

        Go(1, "Hello");
        Go(2, "Hello", "Hi");

    }
//    public static int add1(int a, int b){
//        return a+b;
//    }

    public static int add1(int b , int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }
    public static void Go(int x, String...y){
        System.out.print(y[y.length-x] + " ");

    }
}
