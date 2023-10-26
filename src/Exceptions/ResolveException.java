package Exceptions;

public class ResolveException {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int data;
		try {
			data = i / j;// may throw exception
			// handling the exception
		} catch (Exception e) {
			// resolving exception
			System.out.println(i / (j + 2));
		}
	}
}
