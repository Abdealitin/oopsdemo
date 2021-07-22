package com.yash.abstractdemo;

public class EmployeeApp {
	public static void main(String []args) {
		Manager m = new Manager();
		m.getSal();
		m.getId();
		Employee.getPincode();
		System.out.println(m.address);
	}
}
