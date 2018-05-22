import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int[] arr = { 5, -9, 8, 1, 7, -8, -2, 4, -4, 10 };
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	static Employee[] employee = new Employee[5];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("\nTask 1");
		biggest();
		System.out.println("\nTask 2");
		positiveSum();
		System.out.println("\nTask 3");
		negativeQuantity();
		System.out.println("\nTask 4");
		comparement();

		employee[0] = new Employee("John", 1, 500f);
		employee[1] = new Employee("Bob", 3, 400f);
		employee[2] = new Employee("Sam", 2, 800f);
		employee[3] = new Employee("Paul", 1, 330f);
		employee[4] = new Employee("Dan", 4, 550f);
		

		System.out.println("\nTask 5");
		checkDept();
		

		System.out.println("\nTask 6");
		System.out.println("Arranging workers by the field salary in descending order");
		sortDescSalary();
		

	}

	public static void biggest() {

		int max = arr[0];
		int i = 0;

		while (i <= arr.length - 1) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println("Maximum value of array is " + max);
	}

	public static void positiveSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum += arr[i];
			}
		}
		System.out.println("Sum of positive values is " + sum);
	}

	public static void negativeQuantity() {
		int quant = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				quant++;
			}
		}
		System.out.println("Quantity of negative values is " + quant);
	}

	public static void comparement() {
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				pos++;
			} else {
				neg++;
			}
		}
		if (pos > neg) {
			System.out.println("There are more positive values");
		} else if (pos < neg) {
			System.out.println("There are more negative values");
		} else {
			System.out.println("Quantity of values is equal");
		}
	}

	public static void checkDept() throws NumberFormatException, IOException {
		
		System.out.println("Enter the number of department to find employees");
		int deptToCheck = Integer.parseInt(reader.readLine());

		for (Employee emp : employee) {
			if (emp.getDepartmentNumber() == deptToCheck) {
				System.out.println(emp.getName() + " works in department " + deptToCheck);
			}
		}
	}
		
	public static void sortDescSalary() {
		Employee tmp = null;
		
		for (int i = 0; i < employee.length - 1; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() < employee[j].getSalary()) {
					tmp = employee[i];
					employee[i] = employee[j];
					employee[j] = tmp;
				}
			}
		}
		for (Employee i : employee) {
			System.out.println(i.getName());
		}
		
	}


}
