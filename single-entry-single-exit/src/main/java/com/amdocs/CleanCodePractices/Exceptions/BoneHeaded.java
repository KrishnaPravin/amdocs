package com.amdocs.CleanCodePractices.Exceptions;

import java.util.Scanner;

public class BoneHeaded {

	public static void main(String[] args) {
		System.out.println("Enter the Day number: ");
		final int dayNumber = new Scanner(System.in).nextInt();
	}
	
	static void parseDayNumber(int dayNumber) {
		String daysOfTheWeek[] = {"Sunday", "Monday", "Tue", "Wed", "Thirs", "Fri", "Sat"};
		System.out.println("Parsed day is: " + daysOfTheWeek[dayNumber]);
	}

}
