import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Task 1
		System.out.println("Enter the radius");
		
		double r = Double.parseDouble(reader.readLine());
		System.out.println("The perimeter of a circle shaped flower bed is " + (2 * Math.PI * r));
		System.out.println("The area of a circle shaped flower bed is " + (Math.PI * Math.pow(r, 2)));
		// ----
		
		System.out.println();
		System.out.println();
		
		//Task 2
		String name;
		String address;
		System.out.println("What is your name?");
		name = reader.readLine();
		System.out.println("Where do you live, " + name);
		address = reader.readLine();
		System.out.println(name + ", your address is " + address);
		// ----

		System.out.println();
		System.out.println();
		
		//Task 3
		double c1;
		double c2;
		double c3;
		
		double t1;
		double t2;
		double t3;
		
		System.out.println("Enter cost of a minute for calling from country 1");
		c1 = Double.parseDouble(reader.readLine());
		System.out.println("Enter cost of a minute for calling from country 2");
		c2 = Double.parseDouble(reader.readLine());
		System.out.println("Enter cost of a minute for calling from country 3");
		c3 = Double.parseDouble(reader.readLine());
		
		System.out.println("Enter the duration of call from country 1");
		t1 = Double.parseDouble(reader.readLine());
		System.out.println("Enter the duration of call from country 2");
		t2 = Double.parseDouble(reader.readLine());
		System.out.println("Enter the duration of call from country 3");
		t3 = Double.parseDouble(reader.readLine());
		
		System.out.println("The price for call from contry 1 is " + (c1 * t1));
		System.out.println("The price for call from contry 2 is " + (c2 * t2));
		System.out.println("The price for call from contry 3 is " + (c3 * t3));
		System.out.println("Total is " + ((c1 * t1) + (c2 * t2) + (c3 * t3) ));
	}

}
