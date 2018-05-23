import java.util.Scanner;

public class HW_5_1 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);

		// Task1
		// Ask user to enter the number of month.
		// Read the value and write the amount of days in
		// this month (create array with amount days of each month).

		System.out.println("Task 1");
		int[] Calendar = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter number of a month");

		// checking number of a month
		int n = Integer.parseInt(sc.nextLine());
		while (n < 1 || n > Calendar.length) {
			System.out.println("Enter CORRECT number of a month");
			n = Integer.parseInt(sc.nextLine());
		}
		System.out.println("This month has " + Calendar[n - 1] + " days.");

		// Task2
		// Enter 10 integer numbers. Calculate the sum of first 5 elements
		// if they are positive or product of last 5 element in the other case.

		System.out.println();
		System.out.println("Task 2");
		int[] arr = { -5, 3, 6, 23, 34, 1, -5, -66, -8, -1 };

		boolean f5pozitive = true;
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0) {
				f5pozitive = false;
			}
		}
		int sumF5 = 0;
		int prL5 = 1;
		if (f5pozitive == true) {
			for (int i = 0; i < 5; i++) {
				sumF5 += arr[i];
			}
			System.out.println("Sum of first 5 numbers is = " + sumF5);
		} else {
			for (int i = 5; i < arr.length; i++) {
				prL5 *= arr[i];
			}
			System.out.println("Product of last 5 numbers is = " + prL5);
		}

		// Task3
		// Enter 5 integer numbers. Find
		// -position of second positive number;
		// -minimum and its position in the array.
		// Organize entering integers until the first negative number.
		// Count the product of all entered even numbers.

		System.out.println();
		System.out.println("Task 3");

		int[] arr2 = new int[5];
		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(sc.nextLine());
		}

		// position of second positive number
		int posN = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] >= 0) {
				posN++;
			}
			if (posN == 2) {
				System.out.println("position of second positive number is " + (i + 1));
				break;
			}

		}
		// minimum and its position in the array.
		int min2 = arr2[0];
		int imin = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min2) {
				min2 = arr2[i];
				imin = i;
			}
		}
		System.out.println("Minimum = " + min2 + " on " + (imin + 1) + " place");

		// Accepting only positive numbers
		int[] arrPositive = new int[5];
		System.out.println("Enter only pozitive integer numbers");
		for (int i = 0; i < arrPositive.length; i++) {
			arrPositive[i] = Integer.parseInt(sc.nextLine());
			if (arrPositive[i] < 0) {
				System.out.println("Negative integer number - application will be closed");
				break;
			}
		}
		int arrPositivePr = 1;
		for (int i = 0; i < arrPositive.length; i++) {
			if (arrPositive[i]!=0 && arrPositive[i]%2==0) {
			
			arrPositivePr *= arrPositive[i];
			}
		}
		System.out.println("the product of even entered numbers >0   = " + arrPositivePr);

	}

}
