package Exceptions;

public class MethodPropagation {
	void m1() {
		int data = 10 / 0;
	}

	void n() {
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
		MethodPropagation pm = new MethodPropagation();
		pm.p();
	}
}
