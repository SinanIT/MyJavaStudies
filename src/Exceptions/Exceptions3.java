package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions3 {
    public static void main(String[] args) {
        FileInputStream fis= null;
        int k=0;
        try {
            fis = new FileInputStream("E:\\inteleij\\src\\Exceptions\\Exceptions");

            while ((k =fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
