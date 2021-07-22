package com.yash.inputtypedemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
	public static void main(String [] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter you Name: ");
		String name = buffer.readLine();
		System.out.println("Hey "+name+"! We are glad to have your presence here :)");
	}

}
