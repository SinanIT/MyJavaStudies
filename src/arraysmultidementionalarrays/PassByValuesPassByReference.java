package arraysmultidementionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassByValuesPassByReference {
    public static void main(String[] args) {
        //Java doesn't use pass by reference. When it paas by value original value doesn't change copy ones changes.
//        int price = 100;
//        System.out.println(discount(price));//90
//        System.out.println(price);//100
//        String str = "Java";
//        System.out.println(concatenate(str));//JavaX
//        System.out.println(str);//Java

//        List<Integer> list =  new ArrayList<>(); //list is mutable. so java has changed the original values
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        System.out.println(updateAllElements(list));//[14, 15, 16]
//        System.out.println(list);//[14, 15, 16]
        Scanner scanner = new Scanner(System.in);

        String a = "java";// If you use string assigment Java check the heap memory if there is any string whose value is "java". If there is Java doesn't create new String/object
        // for same values java just create another container but use same value. Like a and b. It is called string pool.
        String b = "java";
        String c = new String("java");// when we use new we told java create new container if the values is same even.

        System.out.println(a + "__" + b + "__" + c);

        System.out.println(a == b);//true -- When we use == it will check value and references that they are same. For references actually it is a==a because java didn't create new container.

        System.out.println(a == c);//false -- we got false because values are same but references are different. Because we use new keyword here.

        // If we get the values from user, java created an empty container before the user give the value. That means references are different then if we compare d with a we get FALSE
        System.out.println("Enter a string");
        String d = scanner.next();// "java"
        System.out.println(a == d);//FALSE

        // If we use equals() method we got true for all opyions because equals jsut checking the value only.
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

    }

    public static int discount(int price) {

        return price - 10;
    }

    public static String concatenate(String str) {

        return str + "X";
    }

    public static List<Integer> updateAllElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 3);
        }
        return list;
    }
}
