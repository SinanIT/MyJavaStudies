package Exceptions;
//creating custom exception

// Name the class by using "Exception" word at the end. It is not must just name convention
//To create "checked exception" you should extend to "Exception" class
//create a constructor with e string parameter and inside the constructor use super()
//

public class InvalidEmailIdCheckException extends Exception{
    private static final long serialVersionID = 1L; //java is giving version ID to the class. Because Exception class should be unique. It is optional.
    public InvalidEmailIdCheckException(String message){
        super(message);
    }

}
