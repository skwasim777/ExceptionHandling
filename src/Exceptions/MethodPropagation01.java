package Exceptions;

import java.io.FileNotFoundException;

/*here we taking example of checked exception to do propagation which is not possible in checked exception
*/
public class MethodPropagation01 {
	void m1() throws FileNotFoundException {
		throw new FileNotFoundException("device erroe");// checked exception
	}

	void n() throws FileNotFoundException {
		m1();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

	}

	public static void main(String[] args) {
		MethodPropagation01 pm = new MethodPropagation01();
		pm.p();
		System.out.println("normal flow");
	}
}
