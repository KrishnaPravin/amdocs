package com.amdocs.CleanCodePractices;

public class ErrorHandling {


	public static void main(String[] args) {
		final int EXCEPTIONAL_MARK = 150;
		
		System.out.println("MARK: " + EXCEPTIONAL_MARK + "\nResult: " + getExamResult(EXCEPTIONAL_MARK));
		
//		System.out.println("MARK: " + EXCEPTIONAL_MARK + "\nResult: " + getExamResultReturnsErrorText(EXCEPTIONAL_MARK));

//		try {
//			System.out.println("MARK: " + EXCEPTIONAL_MARK + "\nResult: " + getExamResultThrowsExceptions(EXCEPTIONAL_MARK));
//		} catch (Error error) {
//			System.out.println(error.getMessage());
//			error.printStackTrace();
//		}
	}
	
	static String getExamResult(int mark) {
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
	
	static String getExamResultReturnsErrorText(int mark) {
		if (mark < 0) {
			return ExamResult.LESS_THAN_ZERO_ERROR;
		}
		if (mark > 100) {
			return ExamResult.GREATER_THAN_HUNDRED_ERROR;
		}
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
	
	static String getExamResultThrowsExceptions(int mark) {
		if (mark < 0) {
			throw new Error(ExamResult.LESS_THAN_ZERO_ERROR);
		}
		if (mark > 100) {
			throw new Error(ExamResult.GREATER_THAN_HUNDRED_ERROR);
		}
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

}
