import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		System.out.println("Enter numbers to divise");
		try {
			System.out
					.println("Result is: " + div(Double.parseDouble(rd.readLine()), Double.parseDouble(rd.readLine())));
		} catch (NumberFormatException e) {
			System.err.print("Entered value is not a number");
		} catch (Exception e) {
			System.err.print("Unknown error");
		}

		try {
			readNumber(0, 10);
		} catch (INumberException e) {
			System.err.println(e.getMessage());
		}

	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static void readNumber(int start, int end) throws INumberException {
		try {
			int a = Integer.parseInt(rd.readLine());
			if (a > start & a < end) {
				System.out.println(a);
			} else {
				throw new INumberException("Entered number does not satisfy the condition");
			}
		} catch (NumberFormatException | IOException e) {
			System.out.println("Entered value is not a number or Input/Output problem occured");
		}

	}

}
