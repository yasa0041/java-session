package com.cuboulder.cs5448;

public class SwapObjects {

	private static class IntWrapper {
		int x;
	};

	public static void main(String[] args) {
		IntWrapper a = new IntWrapper();
		IntWrapper b = new IntWrapper();

		a.x = 1;
		b.x = 2;

		System.out.println("Before Swap a = " + a.x + " b =" + b.x);

		swap(a, b);

		System.out.println("After Swap a = " + a.x + " b =" + b.x);
	}

	private static void swap(IntWrapper a, IntWrapper b) {
		int temp = a.x;
		a.x = b.x;
		b.x = temp;

	}

}
