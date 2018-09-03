package com.cuboulder.cs5448.classesAndObjects;

/** This class is a user-defined abstract class */
public abstract class Shape implements Cloneable {

	/**
	 * get the area of the current object
	 */
	public abstract int area();

	protected ObjectColor color;

	@Override
	public Object clone() throws CloneNotSupportedException {
		// return super.clone();

		Shape clone = (Shape) super.clone();
		clone.color = (ObjectColor) clone.color.clone();
		return clone;
	}

	private static int counter;

	public int getCount() {
		return counter;
	}

	public int incrementCount() {
		return counter++;
	}
}
