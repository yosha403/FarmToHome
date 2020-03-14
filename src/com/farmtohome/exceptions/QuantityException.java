/**
 * File Name: QuantityException.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.exceptions;

public class QuantityException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Problem# 2345 - Negative value for quantity not allowed";
	
	public QuantityException() {
		this( MESSAGE);
	}
	
	/**
	 * @param message
	 */
	public QuantityException(String message) {
		super( message);
	}
}
