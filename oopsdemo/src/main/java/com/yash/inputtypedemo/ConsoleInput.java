package com.yash.inputtypedemo;

public class ConsoleInput {
	public static void main(String []args) {
		String name = System.console().readLine();
		System.out.println("Hey "+name+"! We are glad to have your presence here :)");
	}

}
