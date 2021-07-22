package com.yash.oopsdemo;

public class Labour {
	String name;
	String mobNO;
	String work;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNO() {
		return mobNO;
	}
	public void setMobNO(String mobNO) {
		this.mobNO = mobNO;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Labour(String name, String mobNO, String work) {
		super();
		this.name = name;
		this.mobNO = mobNO;
		this.work = work;
	}
	
}
