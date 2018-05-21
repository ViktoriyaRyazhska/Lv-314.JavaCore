package practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical4 {

	public static void main(String[] args) throws IOException {
		// Task1
		System.out.println("Task1");
		int odd = 0;
		int a;
		int b;
		int c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write 3 digits");
		String input = br.readLine();
		a = Integer.parseInt(input);
		String input2 = br.readLine();
		b = Integer.parseInt(input2);
		String input3 = br.readLine();
		c = Integer.parseInt(input3);

		if (a % 2 != 0) {
			odd++;
		}
		if (b % 2 != 0) {
			odd++;
		}
		if (c % 2 != 0) {
			odd++;
		}
		System.out.println("Quantity of odd numbers=" + odd);
		System.out.println();

		// Task2
		int day;
		System.out.println("Task2");
		System.out.println("Write number of the day");

		String input4 = br.readLine();
		day = Integer.parseInt(input4);

		switch (day) {
		case 1:
			System.out.println("Monday," + " Понеділок," + " Понедельник");
			break;
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
		}

		// Task3
		System.out.println();
		System.out.println("Task3");
		String country;
		Continent cont = null;
		System.out.println("Write country");
		country = br.readLine();

		switch (country) {
		case "USA":
		case "Canada":
			cont = Continent.NAmerica;
			break;
		case "Egypt":
			cont = Continent.Africa;
			break;
		case "China":
			cont = Continent.Asia;
			break;
		case "France":
			cont = Continent.Eupore;
			break;
		default:
			System.out.println("Don't know such country");

		}
		if (cont != null) {
			System.out.println(country + " locates in " + cont + ".");
		}

		// Task4
		System.out.println();
		System.out.println("Task4");

		Product pr1 = new Product("Box", 5, 100);
		Product pr2 = new Product("Table", 2000, 10);
		Product pr3 = new Product("Toy", 30, 70);
		Product pr4 = new Product("Sugar", 13, 500);

		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4);
		System.out.println();
		System.out.println("Max price has " + Product.getMaxPName());
		System.out.println("Max quantity has " + Product.getMaxQName());

		//Setting another product
		pr3.setName("Equipment");
		pr3.setPrice(3000);
		pr3.setQuantity(600);
		// New results
		System.out.println();
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4);
		System.out.println();
		System.out.println("Max price has " + Product.getMaxPName());
		System.out.println("Max quantity has " + Product.getMaxQName());


	}

}
