package Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Ask user to enter the number of month. Read the value and write the amount of days in 
 * this month (create array with amount days of each month).
Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product 
of last 5 element in the other case.
Enter 5 integer numbers. Find 
position of second positive number;
minimum and its position in the array.
Organize entering integers until the first negative number. Count the product of all entered even numbers.
Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of 
class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.*/
public class MainClass {
	// return amount of days
	public static int daysOfMonth(int number_month) {
		int[] days_of_month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return days_of_month[number_month - 1];
	}

	// Calculate sum first 5 elements or product last 5 elements
	public static int manipArray(int[] array) {
		if (countPositiveNumber(array, 0, 5) == 5) {
			return sumArray(array, 5);
		} else {
			return productArray(array, 5);
		}

	}

	// Calculate sum in array
	public static int sumArray(int[] array, int how_mutch_elements) {
		int sum = 0;
		for (int i = 0; i < how_mutch_elements; i++) {
			sum += array[i];
		}
		return sum;
	}

	// Calculate product , read array from end
	private static int productArray(int[] array, int how_mutch_elements) {
		int product = 1;
		for (int i = how_mutch_elements - 1; i > 0; i--) {
			product *= array[i];
		}
		return product;

	}

	// Check array how much positive number it have ; Interval [x;y]
	private static int countPositiveNumber(int[] array, int x, int y) {
		int count = 0;
		for (int i = x; i < y; i++) {
			if (array[i] > 0)
				count++;
		}
		return count;

	}

	// Find index number before maximum
	/*
	 * public static int positionBeforeMaximum(int[] array) { int maximum=array[0];
	 * int index_before_maximum=0; int index_maximum=0; for(int
	 * i=1;i<array.length;i++) { if(array[i]<maximum) {
	 * index_before_maximum=index_maximum; maximum=array[i]; index_maximum=i; } }
	 * return index_before_maximum; }
	 */
	// Return position second positive number
	public static int positionSecondPositiveNumber(int[] array) {
		int count = 0;
		int index_second_positive_number = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
				index_second_positive_number = i;
				if (count == 2) {
					break;
				}
			}
		}
		return index_second_positive_number;
	}

	// Find position of minimum number in array
	public static int positionMinimumNumber(int[] array) {
		int index_min = 0;
		int minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
				index_min = i;
			}
		}
		return index_min;

	}


	// If entered number is negative -> Calculate production
	public static void enteredArray() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> array = new ArrayList<Integer>();
		int entered_number = 1;
		while (entered_number > 0) {
			entered_number = Integer.parseInt(reader.readLine());
			array.add(entered_number);
		}
		System.out.println("The product element =" + productList(array));
	}

	private static int productList(List<Integer> array) {
		int product = 1;
		for (int i = 0; i < array.size(); i++) {
			product *= array.get(i);
		}
		return product;
	}
}