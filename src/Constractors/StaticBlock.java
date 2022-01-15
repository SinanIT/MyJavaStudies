package Constractors;

public class StaticBlock {

    //Static blocks is used to initialize 'static(class) variables
    //benefit of it that executed before everything inside the class.

    public static int age;

    static{
        System.out.println("Static block 1 is executed");
        age= 24;
    }
    static{
        System.out.println("Static block 2 is executed");
        age= 23;
    }
    public StaticBlock(){
        System.out.println("Constructor is executed");
        System.out.println(++age);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed one ");
        System.out.println(++age);
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("Main method executed second");

    }
}
