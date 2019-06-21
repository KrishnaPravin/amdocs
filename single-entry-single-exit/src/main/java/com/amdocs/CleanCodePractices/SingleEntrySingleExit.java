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
