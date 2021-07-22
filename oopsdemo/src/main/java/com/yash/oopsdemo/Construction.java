package com.yash.oopsdemo;

import java.util.List;

public class Construction {
	public String getHouse(List<Labour> labours,double cost) throws InterruptedException {
		long time;
		int workers = labours.size();
		if (workers<10) {
			time = 10000;
		}
		else
			time = 5000;
		System.out.println("Your House is Under Counstruction.........");
		Thread.sleep(time);
		System.out.println("Congratulations your House got Constructed :)");
		return null;
	}
}
