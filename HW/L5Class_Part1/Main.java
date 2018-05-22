package Lesson5ClassWorkPart1;

/*Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
       What values there are more: negative or positive?
*/
public class Main {
	// create Array
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
		System.out.println("The biggest of these numbers " + ArrayManipulation.maxNumber(array));
		System.out.println("The sum of positive numbers " + ArrayManipulation.sumPositiveNumbers(array));
		System.out.println("The amount of negative numbers " + ArrayManipulation.amountNegativeNumbers(array));
		ArrayManipulation.negativeVERSUSpositive(array);

	}

}
