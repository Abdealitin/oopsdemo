package com.yash.interfacedemo;

public class PersonApp {
	public static void main(String []args) {
		Person p = new Person();
		p.withdrawMoney();
		p.checkBalance();
		p.changePassword();
		p.depositMoney();
		System.out.println(p.branch);
	}

}
