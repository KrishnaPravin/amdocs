package com.amdocs.CleanCodePractices.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.amdocs.CleanCodePractices.GetInput;

public class Exogenous {

	public static void main(String[] args) throws IOException {
		String fileName = new GetInput().string("file name") + ".txt";
//		createFile(fileName);
		readFile(fileName);
	}

	private static void createFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.createNewFile()) System.out.println("Created file: " + fileName);
		else throw new IOException("File `" + fileName + "` already exists");
		
		System.out.println("File created at: " + System.getProperty("user.dir"));
	}
	
	private static void readFile(String fileName) {
		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
		
			int i;
			while( (i = fileReader.read()) != -1 ) {
				System.out.print((char) i);
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.println("The file " + fileName + "does not exist. Contact support.");
		}
	}

}