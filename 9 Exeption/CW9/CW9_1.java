import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CW9_1 {

	public static void main(String[] args) throws IOException {

		// Create a method for calculating the area of a rectangle
		// int squareRectangle (int a, int b),
		// which should throw an exception if the user enters negative value. Input
		// values a and b from console. Check the squareRectangle method in the method
		// main. Check to input nonnumeric value.
		System.out.println("Enter a and b");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;

		// Check to input nonnumeric value.
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Input only numeric value");
		}
		// Check to input negative value.
		try {
			int sq = squareRectangle(a, b);
			System.out.println(sq);
		} catch (negativeExeption e) {
			System.err.println("negative Exeption: input only pozitive value");
			e.printStackTrace();
		}

	}

	private static int squareRectangle(int a, int b) throws negativeExeption {
		if (a < 0 || b < 0) {
			throw new negativeExeption();
		}
		return a * b;
	}

}
