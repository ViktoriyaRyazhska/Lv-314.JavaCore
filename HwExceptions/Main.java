package HwExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {
	static double div(double a, double b) throws ArithmeticException {
		if (b != 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Division by zero");

		}

	}

	static int readNumber(int start, int end)
			throws NumberFormatException, NotInRangeException, VisceVersaRangeExcep, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(buf.readLine());

		if (start < end) {
			if (a >= start && a <= end) {

			} else {

				throw new NotInRangeException(" Number is not in specified range");
			}

			return a;

		} else {

			throw new VisceVersaRangeExcep(" Vise-versa range (start>end) ");
		}

	}

	static void methodMain()
			throws NumberFormatException, NotInRangeException, VisceVersaRangeExcep, IOException, BadOrderException {
		int firstInt = Main.readNumber(0, 20);

		for (int i = 1; i < 10; i++) {
			int b = Main.readNumber(0, 20);
			if (firstInt < b) {
				Main.readNumber(0, 20);
				firstInt = b;
			} else {
				throw new BadOrderException("Bad order of input numbers ");
			}
		}

	}

	public static void main(String[] args) {
		try {
			Main.div(34, 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		// ----------------------------------
		System.out.println("Enter number in specified range ");
		try {
			System.out.println(Main.readNumber(0, 20));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (VisceVersaRangeExcep e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NotInRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// ----------------------------------
		System.out.println("Enter 10  numbers  in specified range such as a1<a2....... ");
		try {
			Main.methodMain();
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (VisceVersaRangeExcep e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NotInRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (BadOrderException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
