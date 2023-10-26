package Exceptions;

public class Example01 {
	public static void main(String[] args) {
		try {
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
		System.out.println();
		// Nullpointer Exception
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println();
		// number format Exception
		try {

			String s1 = "abc";
			int i = Integer.parseInt(s1);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println();
		// Array index out of bound exception
		try {

			int a[] = new int[5];
			a[10] = 50;
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
