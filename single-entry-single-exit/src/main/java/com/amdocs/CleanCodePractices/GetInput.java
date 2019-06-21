package com.amdocs.CleanCodePractices;

import java.util.Scanner;

public class GetInput {
	private Scanner keyboardScanner;
	
	public GetInput() {
		this.keyboardScanner = new Scanner(System.in);
	}
	
	public int number(String inputLabel) {
		System.out.println("Enter " + inputLabel + ": ");
		final int input = keyboardScanner.nextInt();
		closeScanner();
		return input;
	}
	
	public String string(String inputLabel) {
		System.out.println("Enter " + inputLabel + ": ");
		final String input = keyboardScanner.nextLine();
		closeScanner();
		return input;
	}
	
	private void closeScanner() {
		this.keyboardScanner.close();
	}
}
