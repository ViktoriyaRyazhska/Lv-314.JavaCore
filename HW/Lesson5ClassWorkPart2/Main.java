package Lesson5ClassWorkPart2;

import Lesson5ClassWorkPart2.Employee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.
*/
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Initialization array
		Employee[] employeers = { new Employee("Petro", 1, 3200), new Employee("Oleg", 1, 3100),
				new Employee("Taras", 2, 3500), new Employee("Ihor", 4, 3000), new Employee("Lida", 3, 4500) };
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of deparment:");
		Employee.showSameDepartment(employeers, Integer.parseInt(reader.readLine()));
		Employee.sortingArray(employeers);
		Employee.showEmployeers(employeers);

	}

}
