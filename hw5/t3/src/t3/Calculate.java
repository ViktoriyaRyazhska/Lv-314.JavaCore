package t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Calculate {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter five numbers: ");
		String[] stringNumbers = getNumbers().split(" ");
		ArrayList<Integer> numbers = parseStringArray(stringNumbers);

		try {
			Integer secondPositive = getSecondPositiveNumber(numbers);
			System.out.println("Second positive number is: " + secondPositive);
		} catch (NoSuchElementException ex) {
			System.out.println("There is no second positive number!");
		}

		Integer smallestNumber = Collections.min(numbers);
		Integer index = numbers.indexOf(smallestNumber);
		System.out.println("Smallest number is: " + smallestNumber + " and its position is: " + index);
	}

	private static String getNumbers() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	private static ArrayList<Integer> parseStringArray(String[] stringArray) {
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		for (String stringNum : stringArray) {
			int num = Integer.parseInt(stringNum);
			numArray.add(num);
		}

		return numArray;
	}

	private static Integer getSecondPositiveNumber(ArrayList<Integer> numbersArray) throws NoSuchElementException {
		int counter = 0;

		for (Integer num : numbersArray) {
			if (num >= 0) {
				counter++;
			}

			if (counter == 2) {
				return num;
			}
		
		}
		

	
		throw new NoSuchElementException();
	}
}