package arraysmultidementionalarrays;

public class MultidimensionalArrays2 {
    public static void main(String[] args) {
        int arr[][] = {{3, 4}, {5}, {6, 7, 9}, {11, 21}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        //find bee
        String sarray[][] = {{"A", "B"}, {"K", "e"}, {"L", "X", "e"}};
        String target = "";
        for (int i = 0; i < sarray.length; i++) {
            target += sarray[i][sarray[i].length - 1];
        }
        System.out.println(target);//Bee

         //Find bee
        String bee="";
        for (int i = 0; i < sarray.length; i++) {
            for (int j = 0; j < sarray[i].length; j++) {
                if (sarray[i][j]=="B"){
                    bee+=sarray[i][j];
                    break;
                }else if(sarray[i][j]=="e"){
                    bee+=sarray[i][j];
                }
            }
        }
        System.out.println(bee);


        //fınd multiplication fırst element of ın every array
        int brr[][] = {{32, 12, 11}, {21, 34}, {3}};
        int prod = 1;

        for (int i = 0; i < brr.length; i++) {
            prod *= brr[i][0];
        }
        System.out.println(prod);
    }
}
