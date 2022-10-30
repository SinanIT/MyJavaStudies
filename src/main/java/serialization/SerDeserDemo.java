package serialization;

import javax.imageio.IIOException;
import java.io.*;

public class SerDeserDemo {

    public static void main(String[] args) {
        Student student = new Student("John", 25, "CA");

        String fileName = "C:\\Users\\sinan\\OneDrive\\Documents\\Projects\\MyJavaStudies\\testData\\Students.txt;";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        try {
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized: \n " + student);
        } catch (IIOException | FileNotFoundException e) {
            System.out.println("IOException is caught " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialization

        FileInputStream fileIn= null;
        ObjectInputStream objIn= null;

        try {
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            objIn.close();
            fileIn.close();

            System.out.println("Object has been deserialized: \n " + object);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("IOException ||ClassNotFoundException is caught. " + e.getMessage());
        }
    }
}
