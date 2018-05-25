import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	static Car[] car = new Car[4];

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Task 1");
		months();

		System.out.println("\nTask 2");
		tenIntNums();

		System.out.println("\nTask 3");
		fiveInts();

		System.out.println("\nTask 4");
		positiveArray();

		System.out.println("\nTask 5");
		car[0] = new Car("sedan", 2003, 1.4f);
		car[1] = new Car("van", 2004, 1.8f);
		car[2] = new Car("sedan", 2008, 2.0f);
		car[3] = new Car("coupe", 2005, 1.2f);
		findCar();
		orderCars();

	}

	public static void months() throws NumberFormatException, IOException {
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter the number of the month");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("In month " + a + " " + months[a - 1] + " days.");
	}

	public static void tenIntNums() throws NumberFormatException, IOException {
		int[] tenNums = new int[10];
		for (int i = 0; i < tenNums.length; i++) {
			tenNums[i] = (int) (Math.random() * 20 - 10);
		}
		System.out.println(Arrays.toString(tenNums));

		boolean firstFive = false;
		for (int i = 0; i < 5; i++) {
			if (tenNums[i] >= 0) {
				firstFive = true;
			} else {
				firstFive = false;
				break;
			}
		}

		int sum = 0;
		int prod = 1;
		if (firstFive == true) {
			for (int i = 0; i < 5; i++) {
				sum += tenNums[i];
			}
			System.out.println("Sum of the first 5 integers is " + sum);
		} else {
			for (int i = 5; i < tenNums.length; i++) {
				prod *= tenNums[i];
			}
			System.out.println("Production of the last 5 integers is " + prod);
		}
	}

	public static void fiveInts() {
		int[] fiveInts = new int[5];
		for (int i = 0; i < fiveInts.length; i++) {
			fiveInts[i] = (int) (Math.random() * 10 - 5);
		}
		System.out.println(Arrays.toString(fiveInts));
		int second = 0;
		int position = 0;
		for (int i = 0; i < fiveInts.length; i++) {
			if (fiveInts[i] >= 0) {
				second++;
				position = i + 1;
				if (second == 2) {
					break;
				}
			}

		}
		System.out.println("Second positive number is on position number " + position);

		int min = fiveInts[0];
		int minPostition = 0;
		for (int i = 0; i < fiveInts.length; i++) {
			if (fiveInts[i] < min) {
				min = fiveInts[i];
				minPostition = i + 1;
			}
		}
		System.out.println("Minimum is " + min + ", it's position is " + minPostition);
	}

	public static void positiveArray() throws NumberFormatException, IOException {
		ArrayList<Integer> positiveArray = new ArrayList<Integer>();
		int a = 0;
		System.out.println("Enter integers");
		while (a >= 0) {
			a = Integer.parseInt(reader.readLine());
			positiveArray.add(a);
		}
		positiveArray.remove(positiveArray.size() - 1);
		System.out.println(Arrays.toString(positiveArray.toArray()));
		int product = 1;
		for (int i = 0; i < positiveArray.size(); i++) {
			if (positiveArray.get(i) % 2 == 0)
				product *= positiveArray.get(i);
		}
		System.out.println("Product of all entered even numbers is " + product);
	}

	public static void findCar() throws NumberFormatException, IOException {
		System.out.println("Enter the year ");
		int year = Integer.parseInt(reader.readLine());
		for (Car car : car) {
			if (car.getYear() == year) {
				System.out.println(car.toString());
			}
		}
	}

	public static void orderCars() {
		System.out.println("\n");
		Car tmp = null;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() < car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		for (Car car : car) {
			System.out.println(car.toString());
		}
	}
}
