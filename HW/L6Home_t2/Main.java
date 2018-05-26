package L6Home_t2;

import java.util.ArrayList;
import java.util.List;

/*Create an array of employees and add the employees with different form of payment.

Arrange the entire sequence of workers descending the average monthly wage. Output the employee
ID, name, and the average monthly wage for all elements of the list.*/
public class Main {

	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new SalariedEmployee(20.5f, 300, "11111111"));
		employee.add(new ContractEmployee("2222222"));
		employee.get(0).setName("Olha");
		employee.get(1).setName("Mykola");
		employee.get(0).setEmployee_id("1");
		employee.get(1).setEmployee_id("2");
		display(employee);
		sortBySallary(employee);
		// display(employee);
	}

	// Sort array by salary
	public static List<Employee> sortBySallary(List<Employee> employee) {

		Employee dummy = null;
		// bubble
		for (int i = 0; i < employee.size() - 1; i++) {
			for (int j = i + 1; j < employee.size(); j++) {
				if (((Salary) employee.get(i)).calculatePay() > ((Salary) employee.get(j)).calculatePay()) {// salary
					dummy = employee.get(i);
					employee.add(i, employee.get(j));
					employee.add(j, dummy);
				}
			}
		}
		return employee;
	}

	// display array
	public static void display(List<Employee> employee) {
		for (int i = 0; i < employee.size(); i++)
			System.out.println("The ID:" + employee.get(i).getEmployee_id() + " The name: " + employee.get(i).getName()
					+ " Salary: " + ((Salary) employee.get(i)).calculatePay());
	}
}
