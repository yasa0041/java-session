package com.cuboulder.cs5448.classesAndObjects;

/** Driver class for this program */
public class Canvas {
	public static void main(String args[]) throws CloneNotSupportedException {
		Rectangle r = new Rectangle(1, 2);
		System.out.println("Total Number of shapes " + r.getCount());

		// create a shallow copy of Rectangle
		Rectangle r2 = (Rectangle) r.clone();

		// change breadth of r
		r.setBreadth(5);
		// change color of r2
		r2.setColor("ORANGE");

		Square s = new Square(5);
		System.out.println("Total Number of shapes " + s.getCount());

		System.out.println(r);
		System.out.println(r2);
		System.out.println(s);
	}
}
