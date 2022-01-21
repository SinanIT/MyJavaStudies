package interfaces;

public interface Interface01 {
    int v1 = 2000;
    String name1 = "Audi";

}
interface Interface02 {
    int v1 = 3000;
    String name2 = "Honda";

}
class Car implements Interface01, Interface02 {
    public static void main(String[] args) {
        System.out.println(name1);
        System.out.println(name2);

        System.out.println(Interface01.v1);//2000
        System.out.println(Interface02.v1);//3000
    }

}
