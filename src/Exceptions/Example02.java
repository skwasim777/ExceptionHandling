package Exceptions;

public class Example02 {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code.....");
	}
}
