package com.yash.polydemo;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account(333354212,"ABC",32000.50,"+9122222222");
		System.out.println(ac);
		ac.show();
		System.out.println(ac.Interest());
		SavingAccount sac = new SavingAccount(452125, "GHI", 50000.35, "+91333333333");
		System.out.println(sac);
		sac.show();
		System.out.println(sac.Interest());
		CurrentAccount cac = new CurrentAccount(452125, "GHI", 50000.35, "+91333333333");
		System.out.println(cac);
		cac.show();
		System.out.println(cac.Interest());
		PFAccount pac = new PFAccount(452125, "GHI", 50000.35, "+91333333333");
		System.out.println(pac);
		pac.show();
		System.out.println(pac.Interest());
		DematAccount dac = new DematAccount(452125, "GHI", 50000.35, "+91333333333");
		System.out.println(dac);
		dac.show();
		System.out.println(dac.Interest());
	}

}
