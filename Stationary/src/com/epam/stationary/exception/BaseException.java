package com.epam.stationary.exception;

public class BaseException extends Exception{
	 private String exceptionMessage;

	    /**
	     * Default constructor
	     */
	    public BaseException() {
	    }

	    /**
	     * A constructor with exception message.
	     * @param msg exception message.
	     */
	    public BaseException(Exception e) {
	    	this.initCause(e);
	    }
	    
	    /**
	     * A constructor with exception message.
	     * @param msg exception message.
	     */
	    public BaseException(String msg) {
	        this.exceptionMessage = msg;
	    }
	    /**
	     * A constructor with message and root cause of the exception.
	     * 
	     * @param msg exception message.
	     * @param e Throwable object.
	     */
	    public BaseException(String msg, Throwable e) {
	        this.exceptionMessage = msg;
	        this.initCause(e);
	    }

	    /**
	     * Sets the cause of the exception. 
	     * @param e Throwable object.
	     */
	    public void setCause(Throwable e) {
	        this.initCause(e);
	    }

	    /**
	     * Gets the class name and exception message.
	     * @see java.lang.Object#toString()
	     */
	    public String toString() {
	        String s = getClass().getName();
	        return s + ": " + exceptionMessage;
	    }

	    /**
	     * Returns the message of the exception. 
	     * @see java.lang.Throwable#getMessage()
	     */
	    public String getMessage() {
	        return exceptionMessage;
	    }
}
