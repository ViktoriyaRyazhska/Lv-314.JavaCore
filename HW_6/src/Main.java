import java.util.Set;
import java.util.TreeSet;

import HW_6_1.Bird;
import HW_6_1.Chicken;
import HW_6_1.Eagle;
import HW_6_1.Penguin;
import HW_6_1.Swallow;
import HW_6_2.CalculatePay;
import HW_6_2.ContractEmployee;
import HW_6_2.Employee;
import HW_6_2.SalariedEmployee;

public class Main {

	static Bird[] bird = new Bird[4];
	static Employee[] emp = new Employee[4];

	public static void main(String[] args) {

		birdTask();
		System.out.println();
		employeeTask();

	}

	public static void birdTask() {

		bird[0] = new Eagle("red", true);
		bird[1] = new Penguin("purple", true);
		bird[2] = new Chicken("green", true);
		bird[3] = new Swallow("orange", true);

		for (Bird b : bird) {
			System.out.print("I am " + b.getBird_type() + ", my feather's colour is " + b.getFeathers() + ".");
			if (b.isLayEggs()) {
				System.out.print(" I can lay eggs. ");
			} else {
				System.out.print(" I can't lay eggs. ");
			}
			b.fly();
			System.out.println();
		}
	}

	public static void employeeTask() {

		emp[0] = new SalariedEmployee("2567453289", 158, "1", "Peter");
		emp[1] = new SalariedEmployee("3578964124", 132, "2", "Michael");
		emp[2] = new SalariedEmployee("4568527539", 141, "3", "Sally");
		emp[3] = new ContractEmployee("7984358481", "4", "Johanna");

		Set<Employee> emp1 = new TreeSet(Employee.getToComp());
		for (Employee employee : emp) {
			emp1.add(employee);
		}
		for (Employee e : emp1) {
			System.out.println(e.getName() + ": ID - " + e.getEmployeeID() + ", monthly wage: "
					+ ((CalculatePay) e).calculatePay());
		}
	}

}
