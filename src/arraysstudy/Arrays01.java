package arraysstudy;

import java.util.Arrays;

public class Arrays01 {
    // why main method is static?
    // Main method should be accessible from every class. Otherwise object creation needed to reach main method.
    public static void main(String[] args) {


        int num [] = {5,1,2,8};
        System.out.println(Arrays.toString(num));//[5, 1, 2, 8]
        //sorting array
        Arrays.sort(num);// for ascending order
        System.out.println(Arrays.toString(num));//[1, 2, 5, 8]
        int revNum[] = new int[num.length];
        for (int i = 0; i<num.length; i++){
            revNum[i]= num[num.length-1-i];
        }
        System.out.println(Arrays.toString(revNum));

        //How to check id an element exist or not in an array
        //sort the array elements
        // use binarySearch() method. If the element exist we get index number of that element. If it is not we get negative order number.
        int num2 []= {2,7,1,13};
        Arrays.sort(num2);//{1, 2, 7, 13}
        System.out.println(Arrays.binarySearch(num2, 7));
        System.out.println(Arrays.binarySearch(num2, 4));// -3
        System.out.println(Arrays.binarySearch(num2, 22));// -5
    }


}
