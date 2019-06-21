package com.amdocs.CleanCodePractices;

import java.util.Scanner;

public class SingleEntrySingleExit {
	
	public static void main(String[] args) {
		final int MARK = getInput("Mark");
		System.out.println("MARK: " + MARK + "\nResult: " + getExamResultSingleExit(MARK));
//		System.out.println("MARK: " + MARK + "\nResult: " + getExamResultSingleExit1(MARK));
//		System.out.print("MARK: " + MARK + "\nResult: " + getExamResultMultiExit(MARK));
	}

	private static int getInput(String inputLabel) {
		System.out.print("Enter " + inputLabel + ": ");
		Scanner keyboardScanner = new Scanner(System.in);
		final int MARK = Integer.parseInt(keyboardScanner.nextLine());
		keyboardScanner.close();
		return MARK;
	}
	
	static String getExamResultSingleExit(int mark) {
		String result = "";
		if (mark < 50) {
			result =  ExamResult.FAIL;
		}
		if (mark < 65) {
			result = ExamResult.PASS;
		}
		if (mark < 85) {
			result = ExamResult.FIRST_CLASS;
		}
		result = ExamResult.DISTINCTION;
		return result;
	}
	
	static String getExamResultSingleExit1(int mark) {
		return mark < 50 ? ExamResult.FAIL
				: mark < 65 ? ExamResult.PASS
				: mark < 85 ? ExamResult.FIRST_CLASS
				: ExamResult.DISTINCTION; 
	}
	
	static String getExamResultMultiExit(int mark) {
		if (mark < 50) {
			return ExamResult.FAIL;
		}
		if (mark < 65) {
			return ExamResult.PASS;
		}
		if (mark < 85) {
			return ExamResult.FIRST_CLASS;
		}
		return ExamResult.DISTINCTION;
	}
	
	public static void labelExample() {
		System.out.println();
		outer: // label for outer loop
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 50; j++) {
					if (j == 3) continue outer;
					System.out.println(" value of j = " + j);
				}
			} // end of outer loop
	}
}


// ---- So…? ---- //
// Code should be clear – both styles are OK.
// As a rule of thumb, short functions make this discussion irrelevant.
// Long flat functions tend to be more readable with SESE
// Long deeply nested functions tend to get simplified with multiple exit points
// Both are bad :)

// ---- And other exit constructs? ---- //
// Exiting blocks with break is a form of “goto”. It is not harmful, as java does not allow harmful “goto” – but it may often make code harder to read.
// Make the decision based on readability of specific code.


// https://medium.com/ncr-edinburgh/early-exit-c86d5f0698ba
