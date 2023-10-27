package Exceptions;

public class FinallyBlock01 {
	public static void main(String[] args) {
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
			// catch will not executed
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		// executing finally exception occure or nor
		finally {
			System.out.println("Finally block is always executed");
		}
		System.out.println("rest of the code");
	}
}
