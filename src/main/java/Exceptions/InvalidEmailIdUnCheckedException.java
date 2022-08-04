package Exceptions;
// to create an unchecked exceptipn extend the RunTimeExceptionClass

public class InvalidEmailIdUnCheckedException extends RuntimeException{
    private static final long serialVersionID = 1L;
    public InvalidEmailIdUnCheckedException(String message){
    super(message);
    }
}
