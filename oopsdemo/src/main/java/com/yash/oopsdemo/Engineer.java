package com.yash.oopsdemo;

public class Engineer {
	double length;
	double width;
	double height;
	String typeOfLand;

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getTypeOfLand() {
		return typeOfLand;
	}
	public void setTypeOfLand(String typeOfLand) {
		this.typeOfLand = typeOfLand;
	}
	public Engineer(double length, double width, double height, String typeOfLand) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.typeOfLand = typeOfLand;
	}
	@Override
	public String toString() {
		return "Engineer [length=" + length + ", width=" + width + ", height=" + height + ", typeOfLand=" + typeOfLand
				+ "]";
	}
	public double getCost() {
		double area = height*width*length;
		double cost = area*10;
		return cost;
	}
	
}
