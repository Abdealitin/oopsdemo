package com.yash.absintdemo;

public class CurrentAcount extends Account {

	@Override
	void getAccountNumber() {
		// TODO Auto-generated method stub
		System.out.println("325498563");
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		double balance = 500000;
		System.out.println(balance);
	}

	@Override
	void acountType() {
		// TODO Auto-generated method stub
		System.out.println("Current Account");
	}

}
