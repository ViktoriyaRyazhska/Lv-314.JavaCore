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
		employee.add(new SalariedEmployee(20.5f, 670, "11111111"));
		employee.add(new ContractEmployee("2222222"));
		employee.get(0).setName("Olha");
		employee.get(1).setName("Mykola");
		employee.get(0).setEmployee_id("1");
		employee.get(1).setEmployee_id("2");
		display(employee);
		sortBySallary(employee);
		display(employee);
	}
	// Sort array by salary
	public static void sortBySallary(List<Employee> employee) {
		employee.sort(new Comparator<Employee>() {
			public int compare(Employee a, Employee b) {
				if (((Salary) a).calculatePay() > ((Salary) b).calculatePay())
					return -1;
				else
					return 1;
			}
		});
	}

	// display array
	public static void display(List<Employee> employee) {
		for (int i = 0; i < employee.size(); i++)
			System.out.println("The ID:" + employee.get(i).getEmployee_id() + " The name: " + employee.get(i).getName()
					+ " Salary: " + ((Salary) employee.get(i)).calculatePay());
	}
}
