package Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ask user to enter the number of month. Read the value and write the amount of days in 
 * this month (create array with amount days of each month).
Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product 
of last 5 element in the other case.
Enter 5 integer numbers. Find 
position of second positive number;
minimum and its position in the array.
Organize entering integers until the first negative number. Count the product of all entered even numbers.
*/
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Show days in month
		System.out.println("Enter number of month:");
		System.out.println("It have " + MainClass.daysOfMonth(Integer.parseInt(reader.readLine())) + " days");
		int[] array = { 3, 2, 4, 5, 6, 2, 1, 4, 5, 6 };
		// Show sum or product
		System.out.println(MainClass.manipArray(array));
		int[] array1 = { 2, 2, 4, 5, 1 };
		System.out.println("Position second positive number:" + MainClass.positionSecondPositiveNumber(array1)
				+ " index of minimum:" + MainClass.positionMinimumNumber(array1));
		// Entering number until first negative number and show product of them
		MainClass.enteredArray();
		Car[] cars = { new Car("Mercedes", (short) 2017, 2.2f), new Car("Opel", (short) 2005, 2.5f),
				new Car("Volkswagen", (short) 2015, 2.0f), new Car("Audi", (short) 2018, 4.2f) };
		// sort by year
		Car.sortByYear(cars);
		// display cars per year of products
		Car.showCarIntoYear(cars, 2017);
		System.out.println("Sorting array");
		// Display array
		Car.showCars(cars);

	}

}