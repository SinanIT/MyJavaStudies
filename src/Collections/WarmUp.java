package Collections;

public class WarmUp {
    //TODO:Create a method to print an integers from 0 to 100 without using any integer
    public static void main(String[] args) {
        intWithoutInt();

    }
    public static void intWithoutInt(){
        Character c1 = 'e'-'e';
        Character c2 = 'e';

        for (Character i = c1; i<c2; i++){
            System.out.println((int)i);
        }
    }
}
