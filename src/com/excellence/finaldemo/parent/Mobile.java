package com.excellence.finaldemo.parent;

 public class Mobile {

	protected String companyName;
	protected double price;

	protected Mobile() {

	}

	public void setCompanyName(String companyNameInput) {

		companyName = companyNameInput;
	}

	protected void setPrice(double priceInput) {
		price = priceInput;
	}

	 public void display() {
		System.out.println("Name:" + companyName + "price:" + price);
	}
}
