package Task_3;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import Birds.Bird;
import Birds.Chiken;
import Birds.Colibri;
import Birds.Crow;
import Birds.Ostrich;
import Empl.CalculatePay;
import Empl.ContractEmployee;
import Empl.Employee;
import Empl.SalariedEmployee;

public class Main {

	static Bird[] bird = new Bird[4];
	static Employee[] emp = new Employee[4];

	public static void main(String[] args) {
		
		BirdsTask();
		System.out.println();
        EmployeesTask();

	}

	public static void BirdsTask() {

		bird[0] = new Colibri("AcidPinkPurple", true);
		bird[1] = new Ostrich("grey", true);
		bird[2] = new Chiken("Brown", true);
		bird[3] = new Crow("Black", true);

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
	
	public static void EmployeesTask() {

		emp[0] = new SalariedEmployee("8904453289", 99, "5", "Chris");
		emp[1] = new SalariedEmployee("5270964124", 125, "3", "Danny");
		emp[2] = new SalariedEmployee("2678527539", 119, "2", "Oscar");
		emp[3] = new ContractEmployee("1841358481", "8", "Steve");

		Set<Employee> emp1 = new TreeSet(Employee.getToComp());
		Collections.addAll(emp1, emp);
	
		
		for (Employee e : emp1) {
			System.out.println(e.getName() + ": ID - " + e.getEmployeeID() + ", monthly stack: "
					+ ((CalculatePay) e).calculatePay());
		}
}

}
