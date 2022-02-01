package interfaces;
//after Java 8 we can create method with body in interface
public interface Interface03 {

    public static final int a=1;


    default int add(int a, int b){
        return a+b;
    }

    static int subtraction(int a, int b){
        return a-b;
    }
    private int multiply(int a, int b){
        return a*b;
    }

}
