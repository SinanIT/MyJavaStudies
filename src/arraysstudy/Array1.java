package arraysstudy;

import java.util.Arrays;

public class Array1 {
    // TO STORE MULTIPLE VALUES INTO A CONTAINER
    // IT CAN TAKE JSUT A SINGLE DATA TYPE
    //ACCEPT PRIMITIVE TYPE AS ELEMENT. WHEN IT IS STORE STRING(NONE PRIMITIVE) JAVA GOES TO HEAP AN FIND THE REFERENCES OF OBJECTS NOT THE STRING ITSELF
    public static void main(String[] args) {
        //creating array

        int array1[] = new int[5];
        array1[0] = -2;
        array1[1] = 11;
        array1[2] = 27;
        array1[3] = 33;
        array1[4] = 22;
        System.out.println(Arrays.toString(array1));

        //or

        String array2[] = {"Ali", "Can", "Kemal", "Mary"};
        System.out.println(Arrays.toString(array2));

        //Update
        array2[1] = "Canan";
        System.out.println(Arrays.toString(array2));
        //If you try to add element more than size of the array we will get run time error

        //update all elements
        // in string length method uses with parenthesis but not in array
        for (int i = 0; i < array2.length; i++) {
            array2[i] = "John";
        }
        System.out.println(Arrays.toString(array2));
        // printing array elements one by one
        int k = 0;
        while (k < array1.length) {
            System.out.println(array1[k]);
            k++;

        }
        //finding sum of array elements
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println(sum);

        //replace * for all the 'J' in array2

        for (int i = 0; i< array2.length; i++){
            array2[i] =array2[i].replace("J", "*");
        }
        System.out.println(Arrays.toString(array2));


    }
}
