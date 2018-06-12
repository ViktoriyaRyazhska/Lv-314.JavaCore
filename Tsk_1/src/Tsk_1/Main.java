package Tsk_1;

import java.util.Scanner;


public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scan_3 = new Scanner(System.in);
		System.out.println("Price of minute for 1 country");
		double price_1 = scan_3.nextDouble();
		System.out.println("Price of minute for 2 country");
		double price_2 = scan_3.nextDouble();
		System.out.println("Price of minute for 3 country");
		double price_3 = scan_3.nextDouble();

		System.out.println("Talks continued for 1 country");
		double time_1 = scan_3.nextDouble();
		System.out.println("Talks continued for 2 country");
		double time_2 = scan_3.nextDouble();
		System.out.println("Talks continued for 3 country");
		double time_3 = scan_3.nextDouble();

	
		String choice = Main.scanner.next();
		
		switch(choice){
		case "1": {
			System.out.println("Prise for 1 call = "+price_1*time_1);
			break;
		}
		case "2": {
			System.out.println("Prise for 2 call = "+price_2*time_2);
			break;
		}
		case "3": {
			System.out.println("Prise for 3 call = "+price_3*time_3);
			break;
		}
		case "4": {
			System.out.println("Prise for all calls = "+((price_1*time_1)+(price_2*time_2)+(price_3*time_3)));
			break;
		}
		}

		
	}

}
