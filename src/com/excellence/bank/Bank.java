package com.excellence.bank;

public class Bank {

	protected String name;
	protected String ifscCode;
	protected double balance;

	protected Bank(String nameInput, String ifscCodeInput, double balanceInput) {
		name = nameInput;
		ifscCode = ifscCodeInput;
		balance = balanceInput;
	}

	public void addMoney(double amount) {

		balance = balance + amount;
	}

	public double withdrawMoney(double amountWidraw) {

		balance = balance - amountWidraw - charge();

		return balance;
	}

	public void displayBalance() {

		System.out.println("Balance:" + balance);
	}

	private double charge() {

		return 0.10;
	}

}
