package com.amdocs.CleanCodePractices.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExogenousErrors {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		final String fileName = scanner.nextLine() + ".txt";
//		createFile(fileName);
		readFile(fileName);
	}
	
	private static void createFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.createNewFile()) {
			System.out.println("File " + fileName + "created");
			System.out.println(System.getProperty("user.dir"));
		} else System.out.println("File " + fileName + " exists already");
	}
	
	private static void readFile(String fileName) {
		try {
			FileReader fileReader = new FileReader(new File(fileName));
			int index = 0;
			while((index = fileReader.read()) != -1) {
				System.out.print((char) index);
			}
		} catch (Exception e) {
			System.out.println("The requested file is not avilable. Please contact support!");
//			e.printStackTrace();
		}
		
		
	}

}
