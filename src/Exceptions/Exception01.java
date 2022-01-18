package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) {
        //first way with nested try catch
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("C:/Users/Yasin/Desktop/myFile.txt");
//
//            int k=0;
//            try {
//                while ((k =fis.read()) !=-1){ //read method ges the file read the first character
//                    System.out.print((char) k);
//                }
//            } catch (IOException e) {
//                System.out.println("File couldn't read");
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("File is deleted or path is wrong");
//        }
        //second way: without nested try catch. After try body we can use multiple catch block. We have to use at least one catch block.
        // catch block order is important. from the child to parent
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:/Users/Yasin/Desktop/myFile.txt");

            int k=0;
                while ((k =fis.read()) !=-1){ //read method ges the file read the first character
                    System.out.print((char) k);
                }
        } catch (FileNotFoundException e) { //FileNotFoundException is child ofIO exception
            e.printStackTrace();
            System.out.println("File is deleted or path is wrong. " + e.getMessage());
        } catch (IOException e){
            System.out.println("File couldn't read");
        }
    }
}
