package com.yash.polydemo;

public class SavingAccount extends Account {

	public SavingAccount(long accNo, String holderName, double balance, String mobNo) {
		super(accNo, holderName, balance, mobNo);
	}
	
	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + ", mobNo="
				+ mobNo + "]";
	}
	
	public void show() {
		System.out.println("This is a Saving Account and the rate of Interest is:-");
	}
	public int Interest(){
		return 4;
	}

}