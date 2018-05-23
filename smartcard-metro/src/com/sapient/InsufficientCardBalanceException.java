package com.sapient;

import java.io.Serializable;

public class InsufficientCardBalanceException extends RuntimeException implements Serializable{

/**
 * Exception Class to handle system generated error
 */
	private static final long serialVersionUID = 4003006682833665031L;	
	
	public InsufficientCardBalanceException(String message) {
		super(message);
	}
	
	public InsufficientCardBalanceException(Throwable cause, String message)
	
	{
	  super(message, cause);	
	}
	

}

