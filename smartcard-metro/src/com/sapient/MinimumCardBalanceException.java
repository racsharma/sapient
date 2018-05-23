package com.sapient;

import java.io.Serializable;

public class MinimumCardBalanceException extends RuntimeException implements Serializable{

/**
 * Exception Class to handle system generated error
 */
	private static final long serialVersionUID = 4003006682833665031L;	
	
	public MinimumCardBalanceException(String message) {
		super(message);
	}
	
	public MinimumCardBalanceException(Throwable cause, String message)
	
	{
	  super(message, cause);	
	}
	
}