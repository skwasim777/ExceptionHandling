package Exceptions;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception accures");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayindexoutofboundexception accurs");
		} catch (Exception e) {
			System.out.println("parent exception accou");
		}
		System.out.println("rest of the ocde");
	}
}
