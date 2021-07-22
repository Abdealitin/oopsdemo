package com.yash.polydemo;

public class PFAccount extends Account {

	public PFAccount(long accNo, String holderName, double balance, String mobNo) {
		super(accNo, holderName, balance, mobNo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PFAccount [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + ", mobNo="
				+ mobNo + "]";
	}
	public void show() {
		System.out.println("This is a PF account and the rate of interest is:-");
	}
	public int Interest() {
		return 8;
	}

}
