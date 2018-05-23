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
		//System.out.println("Enter number of month:");
		//System.out.println("It have " + Home.daysOfMonth(Integer.parseInt(reader.readLine())) + " days");
		//int[] array = { 3, 2, 4, 5, 6, 2, 1, 4, 5, 6 };
		// Show sum or product
		//System.out.println(Home.manipArray(array));
		int[] array1 = { 2, 2, 4, 5, 1 };
		System.out.println("Position second positive number:" + Home.positionSecondPositiveNumber(array1)
				+ " index of minimum:" + Home.positionMinimumNumber(array1));
		// Entering number until first negative number and show product of them
		Home.enteredArray();

	}

}
