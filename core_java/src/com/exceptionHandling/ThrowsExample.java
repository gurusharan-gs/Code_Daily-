package com.exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	
	public static void readFile() throws IOException {
	  File file = new File("example.tex");
	  FileReader reader = new FileReader(file);
	}
	
	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
