package com.Rajvardhan;

@SuppressWarnings("serial")
public class OverratedException extends Exception {
	public OverratedException(String message) {
		System.out.println("Exception ::" + message);
	}
}
