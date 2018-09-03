package com.cuboulder.cs5448;

//Program to check for command line arguments
public class CommandLineArguments {
	public static void main(String[] args) {

		if (args.length > 0) {
			System.out.println("Printing args: ");

			int i = 0;
			for (String arg : args)
				System.out.println(i++ + " : " + arg);
		} else {
			System.out.println("No command line inputs found");
		}
	}
}
