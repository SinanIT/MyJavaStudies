package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WarmUp1 {
    public static void main(String[] args) {
        int [][] arr = {{-4,-3,-2,-1,0,1,2},{-3,-2,-1,0,1,2,3},{-1,0,1,2,3,4}};
        System.out.println(getNegativeElements(arr));
        System.out.println();
        System.out.println(getNegativeElements2(arr));
    }

    //TODO: Create a method to store all negative elements in a list then print the list.
    //Structeres programming
    public static List<Integer> getNegativeElements(int arr[][]) {
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] < 0) {
                    negatives.add(arr[i][k]);
                }else{
                    break;
                }
            }
        }
        return negatives;
    }
    //functional programming can be use in collections
    public static List<Integer> getNegativeElements2(int arr[][]) {
        List<Integer> negatives = new ArrayList<>();
        Arrays.stream(arr).flatMapToInt(t->Arrays.stream(t)).filter(t->t<0).forEach(t-> negatives.add(t));
        return negatives;
    }
}
