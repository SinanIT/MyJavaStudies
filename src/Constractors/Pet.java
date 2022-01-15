package Constractors;

public class Pet {
    static int  count = 0;
    int count1= 0;
    Pet(){
        count+=2;
        //System.out.println(count);//2 4 6
        count1+=2;
        System.out.println(count1); //2 2 2
    }
    public static void main(String[] args) {
//        Cat.eat();
//       new Cat().drink();

        Pet p1 =new Pet();
        //System.out.println(count);//2
        Pet p2 =new Pet();
        //System.out.println(count);//4
        Pet p3 =new Pet();
        //System.out.println(count);//6
    }
}
