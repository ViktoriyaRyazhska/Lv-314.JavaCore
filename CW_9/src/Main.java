import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// System.out.println("Enter 'a' side");
		// int a = Integer.parseInt(reader.readLine());
		// System.out.println("Enter 'b' side");
		// int b = Integer.parseInt(reader.readLine());
		// try {
		// System.out.println("Area is " + squareRectangle(a, b));
		// } catch (NegativeNumberException e) {
		// System.out.println(e.getMessage());
		// }

		ArrayList<Plant> plant = new ArrayList<Plant>();

		try {
			plant.add(new Plant(2, "red", "rose"));
		} catch (TypeException | ColourException e) {
			System.out.println(e.getMessage());
		}

		try {
			plant.add(new Plant(3, "blue", "daisy"));
		} catch (TypeException | ColourException e) {
			System.out.println(e.getMessage());
		}

		try {
			plant.add(new Plant(4, "orange", "tulip"));
		} catch (TypeException | ColourException e) {
			System.out.println(e.getMessage());
		}

		try {
			plant.add(new Plant(1, "white", "chamomile"));
		} catch (TypeException | ColourException e) {
			System.out.println(e.getMessage());
		}

		try {
			plant.add(new Plant(5, "purple", "violet"));
		} catch (TypeException | ColourException e) {
			System.out.println(e.getMessage());
		}
		
		for (Plant p : plant) {
			System.out.println(p);
		}
	}

	public static int squareRectangle(int a, int b) throws NegativeNumberException {
		if (a < 0 | b < 0) {
			throw new NegativeNumberException("Entered negative number");
		}
		return a * b;
	}

}
