package com.example.demo.exception;

public class InvalidInput_Exception extends Exception {

    public final static String USERNAME_ALREADY_AVAILABLE = "Username Already Available";

    public final static String USERNAME_INSUFFICIENT_LENGTH = " Username length should be minumum "
            + "of 8 charaters";

    public final static String EMAIL_ALREADY_AVAILABLE = " Emails Already Available";

    /**
     *
     */
    public InvalidInput_Exception() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public InvalidInput_Exception(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public InvalidInput_Exception(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public InvalidInput_Exception(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public InvalidInput_Exception(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}