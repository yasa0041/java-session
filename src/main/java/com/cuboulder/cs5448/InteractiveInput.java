package com.cuboulder.cs5448;

import java.util.Scanner;

public class InteractiveInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a input : ");
		String input = s.nextLine();
		System.out.println("You've entered " + input);
	}

}
