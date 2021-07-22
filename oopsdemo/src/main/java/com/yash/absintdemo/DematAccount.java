package com.yash.absintdemo;

public class DematAccount extends Account {

	@Override
	void getAccountNumber() {
		// TODO Auto-generated method stub
		System.out.println("642325498563");
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		double balance = 25000;
		System.out.println(balance);
	}

	@Override
	void acountType() {
		// TODO Auto-generated method stub
		System.out.println("Demat Account");
	}

}
