package com.yash.absintdemo;

public class SavingsAccount extends Account {

	@Override
	void getAccountNumber() {
		// TODO Auto-generated method stub
		System.out.println("5425498563");
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		double balance = 55000.35;
		System.out.println(balance);
	}

	@Override
	void acountType() {
		// TODO Auto-generated method stub
		System.out.println("Saving Account");
	}

}
