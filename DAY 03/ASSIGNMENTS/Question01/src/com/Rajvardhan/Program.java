/*************************************
 * Author   :: Rajvardhan Patil
 * Question ::Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables.
 *************************************/
package com.Rajvardhan;

public class Program {

	public static void main(String[] args) {
		InvoiceTest product1 = new InvoiceTest();
		System.out.println(product1.toString());
		System.out.println();
		InvoiceTest product2 = new InvoiceTest("Xre124","Screw Driver",5,50);
		System.out.println(product2.toString());
		System.out.println("Invoice Amount ::"+product2.invoiceAmt());

	}

}
