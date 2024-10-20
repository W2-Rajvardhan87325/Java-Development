package com.Rajvardhan;

@SuppressWarnings("serial")
public class UnderratedException extends Exception{
	
	public UnderratedException(String message) {
		System.out.println("Exception ::"+message);
	}

}
