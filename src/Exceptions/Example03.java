package Exceptions;

public class Example03 {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[10]);// may throw exception

		} catch (ArrayIndexOutOfBoundsException e) {// handling theexception
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}
