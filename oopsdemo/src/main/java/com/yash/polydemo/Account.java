package com.yash.polydemo;

public class Account {
	protected long accNo;
	protected String holderName;
	protected double balance;
	protected String mobNo;
	public Account(long accNo, String holderName, double balance, String mobNo) {
		super();
		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
		this.mobNo = mobNo;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", holderName=" + holderName + ", balance=" + balance + ", mobNo=" + mobNo
				+ "]";
	}
	public void show() {
		System.out.println("This is a simple account.");
	}
	public int Interest() {
		return 2;
	}
}
