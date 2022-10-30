package arraysmultidementionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //creating 2 dimensional array
        //1-
        int arr [][]= new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        //2-
        int arr1 [][]= {{7,11,5},{71,12},{9}};

        //to print multidimensional arr we use deepToString()
        System.out.println(Arrays.deepToString(arr1)); //[[7, 11, 5], [71, 12], [9]]


        //specific element print out
        System.out.println(arr1[1][1]);

        //updating element
        arr1[0][2]= 88;
        arr1[2][0]= 19;
        System.out.println(Arrays.deepToString(arr1));// [[7, 11, 88], [71, 12], [19]]

        //printing first array
        System.out.println(Arrays.toString(arr1[2]));
        System.out.println(Arrays.toString(arr1[0]));

        //finding sum of first array
        int sum = 0;
        for (int i =0; i<arr1[0].length; i++){
            sum+=arr1[0][i];
        }
        System.out.println(sum);

    }
}
