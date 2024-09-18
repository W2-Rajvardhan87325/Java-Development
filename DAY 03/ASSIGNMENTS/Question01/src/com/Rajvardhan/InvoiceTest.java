package com.Rajvardhan;

public class InvoiceTest {
	private String partNum;
	private String partDescrip;
	private int quantity;
	private double price;

	public InvoiceTest() {
		this("nothing", "nothing", 0, 0.0);
	}

	public InvoiceTest(String partNum, String partDescrip, int quantity, double price) {
		this.partNum = partNum;
		this.partDescrip = partDescrip;
		setQuantity(quantity);
		setPrice(price);
	}

	public double invoiceAmt() {
		return this.quantity * this.price;
	}
	// Setters

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public void setPartDescrip(String partDescrip) {
		this.partDescrip = partDescrip;
	}

	public void setPrice(double price) {
		if (price < 0)
			this.price = 0;
		this.price = price;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0)
			this.quantity = 0;
		this.quantity = quantity;
	}

	// Getters
	public String getPartDescrip() {
		return partDescrip;
	}

	public double getPrice() {
		return price;
	}

	public String getPartNum() {
		return partNum;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Part Number ::" + this.partNum + "\nPart Description ::" + this.partDescrip + "\nPart Quantity ::"
				+ this.quantity + "\nPart Price ::" + this.price;
	}
}
