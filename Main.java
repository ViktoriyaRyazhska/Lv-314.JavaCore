import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import task1.Calc;
import task1.Multiples;

public class Main {
	public static void main(String[] arg) throws NumberFormatException, IOException {
		System.out.println("Please enter numbver of the task :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());

		switch (k) {
		case 1:
			System.out.println("Enter number to generate Fibonacci sequence");
			Fabinachi.fabinachi(Integer.parseInt(br.readLine()));
			break;
		case 2:
			System.out.println("Input number to decompose");
			Task2.task2(Integer.parseInt(br.readLine()));
			break;
		case 3:
			System.out.println("Enter exchange rate and amount of gryvnas");
			DollarChange.changeDollar(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
			break;
		case 4:
			System.out.println("Input string to calculate number of loud letters");
			Task4.task4(br.readLine());
			break;
		case 5:
			System.out.println("Enter string to check polindrome");
			Polindrome.polindrome(br.readLine());
			break;
		case 6:
			System.out.println("Input text to count words quantity");
			Task6.task6(br.readLine());
			break;
		case 7:
		   	  System.out.println("Input number");
	    	  Calc.calculate(Integer.parseInt( br.readLine())) ;
			break;
		case 8:
			;
			break;
		case 9:
			System.out.println("Input number 'n'");
			RandomTask.randome(Integer.parseInt(br.readLine()));
			break;
		case 10:
			;
			break;
		case 11:
			;
			break;
		case 12:
			Multiples.multip();
			break;
		default:
			;
			break;
		}

	}
}
