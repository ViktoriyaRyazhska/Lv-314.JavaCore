import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Task 1
		
		System.out.println("Input first number");
		int first = Integer.parseInt(reader.readLine());
		System.out.println("Input second number");
		int second = Integer.parseInt(reader.readLine());
		System.out.println("Input third number");
		int third = Integer.parseInt(reader.readLine());
		
		int oddNums = 0;
		
		if (first % 2 == 0) {oddNums++; }
		if (second % 2 == 0) {oddNums++; }
		if (third % 2 == 0) {oddNums++; }
		
		System.out.println("Quantity of odd numbers - " + oddNums);

		//Task 2
		
		System.out.println();
		System.out.println("Task 2");

		System.out.println("Enter number of the day");
		switch (Integer.parseInt(reader.readLine())) {
		case 1:
			System.out.println("Понеділок, Monday, Понедельник");
			break;
		case 2:
			System.out.println("Вівторок, Tuesday, Вторник");
			break;
		case 3:
			System.out.println("Середа, Wednesday, Среда");
			break;
		case 4:
			System.out.println("Четвер, Thursday, Четверг");
			break;
		case 5:
			System.out.println("П'ятниця, Friday, Пятница");
			break;
		case 6:
			System.out.println("Субота, Saturday, Суббота");
			break;
		case 7:
			System.out.println("Неділя, Monday, Воскресенье");
			break;
		}
		
		//Task 3
		
		System.out.println();
		System.out.println("Task 3");
		System.out.println("Enter the country");
		
		Continent continent = null;
		
		switch(reader.readLine().toLowerCase()) {
		case "japan" : case "yemen" : case "russia" : case "taiwan":
			continent = Continent.ASIA;
			break;
		case "angola" : case "cameroon" : case "niger" : case "guinea":
			continent = Continent.AFRICA;
			break;
		case "estonia" : case "poland" : case "ukraine" : case "greece":
			continent = Continent.EUROPE;
			break;
		case "canada" : case "mexico" : case "cuba" : case "jamaica":
			continent = Continent.N_AMERICA;
			break;
		case "brazil" : case "colombia" : case "peru" : case "chile":
			continent = Continent.S_AMERICA;
			break;
		case "australia" : case "fiji" : case "palau" : case "tonga":
			continent = Continent.AUSTRALIA;
			break;
		}

		System.out.println("Located in " + continent);
	
		//Task 4
		
		System.out.println();
		System.out.println("Task 4");
		
		Product p1 = new Product("Cake", 8.5f, 50);
		Product p2 = new Product("Croissant", 7.9f, 35);
		Product p3 = new Product("Roll", 7.5f, 65);
		Product p4 = new Product("Bun", 9f, 42);
		
		float mostExp = -1;
		int numerous = -1;
		
		if (mostExp < p1.getPrice()) {
			mostExp = p1.getPrice();
			if (mostExp < p2.getPrice()) {
				mostExp = p2.getPrice();
				if (mostExp < p3.getPrice()) {
					mostExp = p3.getPrice();
					if (mostExp < p4.getPrice()) {
						mostExp = p4.getPrice();
						System.out.println("The most expensive product is " + p4.getName() + " and it's quantity is " + p4.getQuantity());
					}else {
						System.out.println("The most expensive product is " + p3.getName() + " and it's quantity is " + p3.getQuantity());
					}
				}else {
					System.out.println("The most expensive product is " + p2.getName() + " and it's quantity is " + p2.getQuantity());
				}
			}else if (mostExp < p3.getPrice()){
				mostExp = p3.getPrice();
				if (mostExp < p4.getPrice()) {
					mostExp = p4.getPrice();
					System.out.println("The most expensive product is " + p4.getName() + " and it's quantity is " + p4.getQuantity());
				}else {
					System.out.println("The most expensive product is " + p3.getName() + " and it's quantity is " + p3.getQuantity());
				}
				
			}else if (mostExp < p4.getPrice()) {
				mostExp = p4.getPrice();
				System.out.println("The most expensive product is " + p4.getName() + " and it's quantity is " + p4.getQuantity());
			}else {
				System.out.println("The most expensive product is " + p1.getName() + " and it's quantity is " + p1.getQuantity());
			}
		}
		
		if (p1.getQuantity() > numerous) {
		numerous = p1.getQuantity();
		if (numerous < p2.getQuantity()) {
			numerous = p2.getQuantity();
			if (numerous < p3.getQuantity()) {
				numerous = p3.getQuantity();
				if (numerous < p4.getQuantity()) {
					numerous = p4.getQuantity();
					System.out.println("The biggest quantity has " + p4.getName());
				}else {
					System.out.println("The biggest quantity has " + p3.getName());
				}
			}else {
				System.out.println("The biggest quantity has " + p2.getName());
			}
		}else if (numerous < p3.getQuantity()) {
			numerous = p3.getQuantity();
			if (numerous < p4.getQuantity()) {
				numerous = p4.getQuantity();
				System.out.println("The biggest quantity has " + p4.getName());
			}else {
				System.out.println("The biggest quantity has " + p3.getName());
			}
		}else if (numerous < p4.getQuantity()) {
			numerous = p4.getQuantity();
			System.out.println("The biggest quantity has " + p4.getName());
		}else {
			System.out.println("The biggest quantity has " + p1.getName());
		}
	}
	}

}
