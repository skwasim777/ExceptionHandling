package Exceptions;

import java.io.IOException;

/*basically throws keywords is used declare the exception
*/
public class ThrowsKeyWord {
	void m1() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m1();
	}

	void p() {
		try {
			n();
		} catch (IOException e) {
			System.out.println("Excpetion Handled");

		}
	}

	public static void main(String[] args) {
		ThrowsKeyWord t = new ThrowsKeyWord();
		t.p();
		System.out.println("rest of the code");
	}
}
