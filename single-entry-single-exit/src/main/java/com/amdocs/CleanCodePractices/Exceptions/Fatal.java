package com.amdocs.CleanCodePractices.Exceptions;

public class Fatal {

	public static void main(String[] args) {
		int arraySize = 100;
		do {
			int emptyArray[] = new int[arraySize];
			System.out.println("Created array of size: " + arraySize);
			arraySize *= 100;
		} while (true);
	}

}
