package Exceptions;

public class GenerateException {
	public static void main(String[] args) {
		try {
			int data1 = 50 / 0;// may throw exception
		} catch (Exception e) {
			// generating exception in cathc block
			//int data2 = 50 / 0;

		}
		System.out.println("rest of the code....");
	}
}
