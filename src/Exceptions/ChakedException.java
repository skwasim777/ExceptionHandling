package Exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ChakedException {
	public static void main(String[] args) {
		PrintWriter pi;
		try {

			pi = new PrintWriter("abc.txt");
			pi.print("saved");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("file saved successfully");
	}
}
