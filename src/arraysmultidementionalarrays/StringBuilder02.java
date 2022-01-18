package arraysmultidementionalarrays;

public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb1 =  new StringBuilder("Java");
        StringBuilder sb2 =  new StringBuilder("Java");
        //even the values are same StringBuilder equals() method returns false. Because equals() method in StringBuilder uses "==" in it.
        System.out.println(sb1.equals(sb2));//False
        //how can we compare the values of these two StringBuilder. Use toString() method for both. This time equals() comes from String class
        System.out.println(sb1.toString().equals(sb2.toString()));//true
        //second way compareTo() method
        System.out.println(sb1.compareTo(sb2));// this give us int 0. That means this two StringBuilder is equal.


        //Concatenation
        //in string we use concat()
        //in StringBuilder we use append()

        //1- This is faster then String
        StringBuilder sb3 = new StringBuilder();
        long startingTimeSB = System.nanoTime();//returning long
        for (int i=0; i<1000; i++){
            sb3.append("abc");
        }
        long endingTimeSB = System.nanoTime();
        System.out.println(endingTimeSB - startingTimeSB);

        String str = new String();
        long startingTimeString = System.nanoTime();//returning long
        for (int i=0; i<1000; i++){ //Java cretimg 1000 container.
            str.concat("abc");
        }
        long endingTimeString = System.nanoTime();
        System.out.println(endingTimeString - startingTimeString);
    }
}
