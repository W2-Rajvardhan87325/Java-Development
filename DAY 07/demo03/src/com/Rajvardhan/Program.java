package com.Rajvardhan;

public class Program {
    public static void main(String[] args) throws CustomException{
       try {
       Time t1 = new Time(23, 600, 25);
       t1.displayRecords();
       }
       catch(CustomException e) {
    	   e.displayError();
       }
         
    }
}
