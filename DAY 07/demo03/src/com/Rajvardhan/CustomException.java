package com.Rajvardhan;

public class CustomException extends Exception {
    private String invalidField;
    private int invalidValue;

    public CustomException(String field, int value) {
        this.invalidField = field;
        this.invalidValue = value;
    }

    public void displayError() {
        System.out.println("\t\tInvalid Inputs");
        System.out.println("Invalid Field :" + this.invalidField);
        System.out.println("Invalid Value :" + this.invalidValue);
    }

}
