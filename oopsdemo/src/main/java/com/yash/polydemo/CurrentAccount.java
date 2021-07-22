package com.yash.polydemo;

public class CurrentAccount extends Account {

	public CurrentAccount(long accNo, String holderName, double balance, String mobNo) {
		super(accNo, holderName, balance, mobNo);
	}

	@Override
	public String toString() {
		return "CurrentAccount [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + ", mobNo="
				+ mobNo + "]";
	}
	public void show() {
		System.out.println("This is a Current account and the rate of interest is:-");
	}
	public int Interest() {
		return 6;
	}

}
