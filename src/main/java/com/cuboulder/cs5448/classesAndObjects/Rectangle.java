package com.cuboulder.cs5448.classesAndObjects;

/** This class is used to define a rectangle */
public class Rectangle extends Shape {

	private int length;
	private int breadth;

	Rectangle(int length, int breadth) {
		System.out.println("Creating new Rectangle");
		this.length = length;
		this.breadth = breadth;
		incrementCount();
		super.color = new ObjectColor("RED");
	}

	// @Override
	// public int area() {
	// return length * breadth;
	// }

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	// @formatter:off
	@Override
	public String toString() {
		return "Rectangle with length: " + length 
				+ " breadth: " + breadth 
				+ " color: " + super.color.getColor()
				+ " has an area of: " + this.area();
	}
	// @formatter:on

	public void setColor(String colorString) {
		super.color.setColor(colorString);
	}

	@Override
	public int area() {
		return length * breadth;
	}
}
