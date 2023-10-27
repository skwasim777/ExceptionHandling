package Exceptions;

/*here we are going to check weather the person is elegible for vote or not if 
 * he is less than 18 year then throw 
exception other wise print massege welocme to vote*/

public class Throw01 {
	public static void validate(int age) {
		if (age < 18) {
			// throw arithmetic exception if not eligible for vote
			throw new ArithmeticException("Person is not eligible for vote");
		} else {
			System.out.println("Person is eligible for vote");
		}
	}

	public static void main(String[] args) {
		validate(18);
		System.out.println("rest of the code");
	}
}
