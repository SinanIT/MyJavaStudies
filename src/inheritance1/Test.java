package inheritance1;

public class Test  extends Derived{
    public static void main(String[] args) {
        Derived obj = new Test();
        obj.getDetails();
    }
    protected void getDetails(){
        System.out.println("Test Class");
    }
}
