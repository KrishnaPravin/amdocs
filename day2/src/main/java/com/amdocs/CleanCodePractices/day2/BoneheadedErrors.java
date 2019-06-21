package com.amdocs.CleanCodePractices.day2;

import java.util.Scanner;

public class BoneheadedErrors {
	public static void main(String a[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day number: ");
		final int dayInNumber = scanner.nextInt() - 1;
		
		if (dayInNumber > 7) System.out.println("Check the validity of the dayNumber!!");
		else System.out.println("Parsed day: " + parseDay(dayInNumber));
	}
	
	private static String parseDay(int dayInNumber) {
		final String days[] = {"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun" };
		return days[dayInNumber];
	}
	
}
