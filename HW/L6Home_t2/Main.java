package L6Home_t2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Create an array of employees and add the employees with different form of payment.
Arrange the entire sequence of workers descending the average monthly wage. Output the employee
ID, name, and the average monthly wage for all elements of the list.*/
public class Main {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new SalariedEmployee(20.5f, 440, "124313", "Petro", "1"));
		employee.add(new ContractEmployee("132412", "Olga", "2"));
		display(employee);
		sortBySallary(employee);
		display(employee);
	}

	// Sort array by salary
	public static void sortBySallary(List<Employee> employee) {
		employee.sort(new Comparator<Employee>() {
			public int compare(Employee a, Employee b) {
				return ((Salary) a).calculatePay() < ((Salary) b).calculatePay() ? -1 : 1;
			}
		});
	}

	// display array
	public static void display(List<Employee> employee) {
		for (int i = 0; i < employee.size(); i++)
			System.out.printf("The ID: %s Name: %s Salary %.2f\n", employee.get(i).getEmployee_id(),
					employee.get(i).getName(), ((Salary) employee.get(i)).calculatePay());

	}
}
