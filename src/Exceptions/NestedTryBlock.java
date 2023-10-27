package Exceptions;

public class NestedTryBlock {
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block 1
			try {
				System.out.println("going to devide by zero");
				int b = 39 / 0;
				// catch block for inner try
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			// inner try block 2
			try {
				int[] a = new int[10];
				a[10] = 9;
				// catch block for inner block 2
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Other Statement");
		} catch (Exception e) {
			System.out.println("Handle the exception(outer catch block)");
		}
		System.out.println("normal flow");
	}
}
