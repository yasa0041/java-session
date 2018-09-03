package com.cuboulder.cs5448;

public class SwapPrimitives {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("Before Swap a = " + a + " b =" + b);

		swap(a, b);

		System.out.println("After Swap a = " + a + " b =" + b);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
