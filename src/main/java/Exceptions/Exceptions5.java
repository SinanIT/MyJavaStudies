package Exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions5 {
    //Throws keyword is used to "checked exception"(Compile time)
    //throws keyword is used when we do not handle the exception
    //afer throws we can use multiple exception classes by putting comma
    //throws keyword can not be used in method body, it must be used in method name line

    public static void main(String[] args) throws IOException {//FileNotFoundException handle first but IOException is parent of FileNotFoundException.

            FileInputStream fis =  new FileInputStream("C:/Users/Yasin/Desktop/myFile.txt");

            int k=0;
            while ((k =fis.read()) !=-1){ //read method ges the file read the first character
                System.out.print((char) k);
            }
        }
}
