package questions;

public class FindAWordINArray {
    public static void main(String[] args) {

        //find bee
        String sarray[][] = {{"A", "B"}, {"K", "e"}, {"L", "X", "e"}};
        String target = "";
        for (int i = 0; i < sarray.length; i++) {
            target += sarray[i][sarray[i].length - 1];
        }
        System.out.println(target);//Bee


//        //Find bee
//        String bee="";
//        for (int i = 0; i < sarray.length; i++) {
//            for (int j = 0; j < sarray[i].length; j++) {
//                if (sarray[i][j]=="B"){
//                    bee+=sarray[i][j];
//                    break;
//                }else if(sarray[i][j]=="e"){
//                    bee+=sarray[i][j];
//                }
//            }
//        }
//        System.out.println(bee);
    }
}
