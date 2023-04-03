package com.excellence.bank.hdfc;

import com.excellence.bank.Bank;

public class HdfcBank extends Bank {

	String branchId;

	final String name = "HDFC";

	public HdfcBank(String nameInput, String ifscCodeInput, double balanceInput) {
		super(nameInput, ifscCodeInput, balanceInput);

	}

	public double withdrawMoney(double amountWidraw) {

		balance = balance - amountWidraw - charge();

		return balance;
	}

	private double charge() {

		return 0.20;
	}

	public void setBranchId(String branchIdInput) {
		branchId = branchIdInput;
	}

	public void displayAllDetails() {

		System.out.println("Name:" + name + "ifscCode:" + ifscCode + "balance:" + balance + "BranchId:" + branchId);
	}
}
