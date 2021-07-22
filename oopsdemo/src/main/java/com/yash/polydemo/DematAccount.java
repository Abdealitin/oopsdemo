package com.yash.polydemo;

public class DematAccount extends Account {
	public DematAccount(long accNo, String holderName, double balance, String mobNo) {
		super(accNo, holderName, balance, mobNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DematAccount [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + ", mobNo="
				+ mobNo + "]";
	}
	public void show() {
		System.out.println("This is a Demat account and the rate of interest is:-");
	}
	public int Interest() {
		return 10;
	}

}
