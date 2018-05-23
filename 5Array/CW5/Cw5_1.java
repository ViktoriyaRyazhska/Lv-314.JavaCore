import java.util.Scanner;

public class Cw5_1 {

	private static Scanner sc;

	public static void main(String[] args) {
		int[] arr = { 5, 2, 5, -6, 7, 8, -5, 0, 89, -50 };
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
		}
		System.out.println("Sum of all array=" + sumArr);

		int sumP = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0)
				sumP += arr[i];
		}
		System.out.println("Sum pozitive=" + sumP);

		int countN = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				countN++;
		}
		System.out.println("Negative digits=" + countN);
		int countP = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0)
				countP++;
		}
		if (countP > countN) {
			System.out.println("There are more positive values");
		}
		if (countP < countN) {
			System.out.println("There are more negative values");
		}
		if (countP == countN) {
			System.out.println("There are equals amount of values");
		}
		
		
		
		//Employee task
		int Q = 5;
		Employee[] em = new Employee[Q];
		em[0] = new Employee("Vova", 505, 5000.0);
		em[1] = new Employee("Pavlo", 314, 1000.0);
		em[2] = new Employee("Ivan", 314, 7000.0);
		em[3] = new Employee("Ira", 505, 2000.0);
		em[4] = new Employee("Ivan", 501, 10000.0);

		sc = new Scanner(System.in);
		System.out.println("Enter a number of department of the range 505 314 501");
		int n = Integer.parseInt(sc.nextLine());
		Employee.depatfilter(em, n);
		Employee.sortS(em);

	}

}
