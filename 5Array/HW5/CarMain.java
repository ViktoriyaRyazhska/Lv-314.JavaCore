import java.util.Scanner;


public class CarMain {

	public static void main(String[] args) {

		int Q = 4;
		Car[] carA = new Car[Q];
		carA[0] = new Car("cupe", 1999, 4.2f);
		carA[1] = new Car("sedan", 1999, 2.2f);
		carA[2] = new Car("sedan", 2011, 4.2f);
		carA[3] = new Car("cupe", 1998, 1.8f);

		// certain model year (enter year in the console);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter year in the console");
		int yearC = Integer.parseInt(sc.nextLine());
		Car.modelYear(carA, yearC);
		
		// ordered by the field year.//sorting?
		Car.sortYear(carA);
	}

}
