package com.amdocs.CleanCodePractices.day2;

public class FatalErrors {

	public static void main(String[] args) {
		int arraySize = 100;
		while(true) {
			int newArray[] = new int[arraySize];
			System.out.println("Current ArraySize: " + arraySize);
			arraySize = arraySize * 10;
		}
	}

}
