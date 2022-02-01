package Exceptions;

public class TestInvalidEmailIdCheckException {
    public static void main(String[] args) {

        try {
            validateEmailID("sinan@gmaill.com");
        } catch (InvalidEmailIdCheckException e) {
            System.out.println(e.getMessage()); // we will the message wehat we put inside the exception class in the method
        }

    }

    public static void validateEmailID(String emailId) throws InvalidEmailIdCheckException {

        if (emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
            System.out.println(emailId);
        } else {
            throw new InvalidEmailIdCheckException("Email ID is not valid");

            }
        }
    }


