package com.yash.inputtypedemo;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hey "+name+"! We are glad to have your presence here :)");
	}

}
