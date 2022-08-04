package basics;

public class WrapperClass {
    /*
        Wrapper Class: Java created some objects whose values are come from
        primitive data types but the objects have methods as well
        int=>Integer
        char=>Character
        byte=>Byte
        long=> Long
        short=>Short
        float=>Float
        double=>Double
        */
    public static void main(String[] args) {
        Integer integer = 12;// in heap memory
        System.out.println(integer);
        Boolean b= true;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Boolean.TRUE);
    }
}
