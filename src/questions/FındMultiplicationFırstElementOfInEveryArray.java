package questions;

public class FındMultiplicationFırstElementOfInEveryArray {
    public static void main(String[] args) {


        //fınd multiplication fırst element of ın every array
        int brr[][] = {{32, 12, 11}, {21, 34}, {3}};
        int prod = 1;

        for (int i = 0; i < brr.length; i++) {
            prod *= brr[i][0];
        }
        System.out.println(prod);
    }
}
