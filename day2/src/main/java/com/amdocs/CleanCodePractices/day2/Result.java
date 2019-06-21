package com.amdocs.CleanCodePractices.day2;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		System.out.print("Enter the marks: ");
		Scanner scanner = new Scanner(System.in);
		final int MARK = scanner.nextInt();
		System.out.println("Mark: " + MARK + "\nREsult: " + checkResult1(MARK));
	}
	
	private static String checkResult(int mark) {
		String result = "";
		if (mark < 50) {
			result = "FAIL";
		} else if (mark < 85) {
			result ="PASS";
		} else {
			result = "DISTINCTION";
		} 
		return result;
	}
	
	private static String checkResult1(int mark) {
		if (mark > 100) {
			throw new Error("Enter Valid mark");
		}
		if (mark < 50) {
			return "FAIL";
		}
		if (mark < 85) {
			return "PASS";
		}
		return "DISTINCTION";
	}

}
