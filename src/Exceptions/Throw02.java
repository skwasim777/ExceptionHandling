package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw02 {
	public static void method() throws FileNotFoundException {
		FileReader f = new FileReader("abc.txt");
		BufferedReader b = new BufferedReader(f);

		throw new FileNotFoundException();
	}

// main method
	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}
}
