package Exceptions;

/*when a exception occure but not handle by catch block*/

public class FinallyExample02 {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// finally block will be executed
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code....");
	}
}
