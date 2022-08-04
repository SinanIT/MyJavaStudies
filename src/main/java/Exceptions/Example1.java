package Exceptions;

public class Example1 {
    String str = "a";

    void A() {
        try {
            str = str + "b";
            B();
        } catch (Exception e) {
            str = str + "c";
        }

    }

    void B() throws Exception {
        try {
            str = str + "d";
            C();
        } catch (Exception e) {
            str = str + "e";
        } finally {
            str = str + "f";
        }
        str = str + "g";
    }

    void C() throws Exception {
        System.out.println(12 / 0);
    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {

        Example1 example1 = new Example1();
        example1.A();
        example1.display();


        try {
            System.out.println("work hard");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }catch (RuntimeException e){

        }
    }
}
