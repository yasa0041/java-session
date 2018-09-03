package com.cuboulder.cs5448.classesAndObjects;

/** This class is used to define a square */
public class Square extends Shape {

	private int side;

	Square(int side) {
		System.out.println("Creating new Square");
		this.side = side;
		super.incrementCount();
		super.color = new ObjectColor("BLUE");
	}

	@Override
	public int area() {
		return side * side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
