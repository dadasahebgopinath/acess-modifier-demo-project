package com.excellence.bank.orch;

import com.excellence.bank.hdfc.HdfcBank;

public class BankManagement {

	public static void main(String[] args) {

		HdfcBank h1 = new HdfcBank("HDFC", "HDFC02928", 100);
		h1.displayBalance();
		h1.addMoney(150);
		h1.displayBalance();
		h1.withdrawMoney(50);
		h1.displayBalance();
		h1.setBranchId("Pune-123");
		h1.displayAllDetails();

	}

}
