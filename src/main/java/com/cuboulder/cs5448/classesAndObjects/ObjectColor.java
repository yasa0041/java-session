package com.cuboulder.cs5448.classesAndObjects;

public class ObjectColor implements Cloneable {
	private String color;

	ObjectColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
