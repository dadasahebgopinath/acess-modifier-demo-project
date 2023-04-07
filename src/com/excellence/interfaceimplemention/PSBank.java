package com.excellence.interfaceimplemention;

import com.excellence.interfacedemo.Bank;

public class PSBank implements Bank {

	int balance;

	PSBank(int inputBalance) {
		balance = inputBalance;
	}

	@Override
	public int withdraw(int amount) {

		balance = balance - amount;
		return balance;
	}

	@Override
	public int addMoney(int money) {

		balance = balance + money;
		return balance;
	}

	@Override
	public int displayBalance() {

		System.out.println(balance);
		return balance;
	}

}
