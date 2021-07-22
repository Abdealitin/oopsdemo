package com.yash.abstractdemo;

public abstract class Employee {
	final static String address = "Indore";
	Employee(){
		System.out.println("Employee default constructor");
	}
	static void getPincode() {
		System.out.println("452014");
	}
	void getCompanyName() {
		System.out.println("Yash");
	}
	abstract void getSal();
	abstract void getId();
	abstract void getDesignation();
}
