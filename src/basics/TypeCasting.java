package basics;

public class TypeCasting {
    public static void main(String[] args) {
        byte b1 = 122; // auto widening
        int i1= b1;

        int i2 = 1200;
        short s1 = (byte)i2; // explicit narrowing
        System.out.println(s1);

        float f1 = 2.3f; // for flot we need to put f end of value or need to do explicit narrowing
        float f2 = (float) 2.3;

        // increment decrement

        int num1 = 5; // assigment operatp is '='
        System.out.println(num1);
        num1= num1 + 3;
        System.out.println(num1);
        num1 += 3;
        System.out.println(num1);
        num1 -= 3;
        System.out.println(num1);
        System.out.println(num1++);//8
        System.out.println(num1);//9
        System.out.println(+num1);//9
        System.out.println(num1--);//9
        System.out.println(num1);//8
        System.out.println(-num1);//-8
        System.out.println(--num1);//7

    }
}
