/*************************************
 * Author   :: Rajvardhan Patil
 * Question ::Create a class called Date that includes three instance variables—a 
month (type int), a day (type int) and a year (type int). Provide a constructor 
that initializes the three instance variables and assumes that the values 
provided are correct. Provide a set and a get method for each instance 
variable. Provide a method displayDate that displays the month, day and 
year separated by forward slashes (/). Write a test application named 
DateTest that demonstrates class Date’s capabilities.
 *************************************/

package com.Rajvardhan;

public class Program {

	public static void main(String[] args) {
        
        Date date1 = new Date(3, 6, 2003);  
        Date date2 = new Date(23, 11, 2002); 

        System.out.println("Date 1:");
        date1.displayDate();
        System.out.println();

        System.out.println("Date 2:");
        date2.displayDate();
	}

}
