package Exceptions;

import java.io.IOException;

public class TestInvalidEmailIdUnCheckedException {
    public static void main(String[] args) {
        try {
            validateEmailId("sinan@gmail.com");//Exception in thread "main" Exceptions.InvalidEmailIdUnCheckedException: Email Id is invalid
        } catch (InvalidEmailIdUnCheckedException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void validateEmailId(String emailId){
        if (emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")){
            System.out.println(emailId);
        }else
            throw new InvalidEmailIdUnCheckedException("Email Id is invalid");
    }
}
