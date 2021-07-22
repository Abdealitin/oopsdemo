package com.yash.interfacedemo;

public class Person implements AtmMachine {

	public void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money withdrawn");
	}

	@Override
	public void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("Money Deposited");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Your Balance is Diplayed");
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("Your Password has been Changed");
	}

//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		
//	}


}
