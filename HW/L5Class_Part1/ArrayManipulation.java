package Lesson5ClassWorkPart1;

/*Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
       What values there are more: negative or positive?
*/
public class ArrayManipulation {
	// find maximum
	public static int maxNumber(int[] array) {
		int max = array[0];
		// if(array.length==0)
		for (int i = 1; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		return max;

	}

	// count positive number
	public static int sumPositiveNumbers(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] > 0)
				sum += array[i];
		return sum;
	}

	// amount of negative numbers
	public static int amountNegativeNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] < 0)
				count++;

		return count;
	}

	public static int amountPositiveNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] > 0)
				count++;

		return count;
	}

	// Calculates which numbers are more negative or positive
	public static void negativeVERSUSpositive(int[] array) {
		if (ArrayManipulation.amountNegativeNumbers(array) > ArrayManipulation.amountPositiveNumbers(array)) {
			System.out.println("Negative numbers are larger");
		} else if (ArrayManipulation.amountNegativeNumbers(array) < ArrayManipulation.amountPositiveNumbers(array)) {
			System.out.println("Positive numbers are larger");
		} else {
			System.out.println("Positive numbers and negative equally");
		}

	}

}
