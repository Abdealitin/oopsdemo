package com.yash.inputtypedemo;

public class CommandLineInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hey ");
		if(args.length>0)
			for(String i:args) {
				System.out.print(i+" ");
			}
		System.out.print("! We are glad to have your presence here :)");
	}

}