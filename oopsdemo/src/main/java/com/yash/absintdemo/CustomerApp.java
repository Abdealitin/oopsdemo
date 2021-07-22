package com.yash.absintdemo;

public class CustomerApp {
	public static void getCurrentBalance() {
		CurrentAcount ca = new CurrentAcount();
		ca.getBalance();
	}
	public static void getSavingsBalance() {
		SavingsAccount sa = new SavingsAccount();
		sa.getBalance();
	}
	public static void getDematBalance() {
		DematAccount da = new DematAccount();
		da.getBalance();
	}
	public static void main(String[]args) {
		getCurrentBalance();
	}
}
