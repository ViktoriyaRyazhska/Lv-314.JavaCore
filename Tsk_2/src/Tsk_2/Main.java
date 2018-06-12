package Tsk_2;

public class Main {

	public static void main(String[] args) {

		Employee fredo = new Employee("Fredo", 100, 50);
		Employee savage = new Employee("Ann", 88, 45);
		Employee cheef = new Employee("Max", 75, 35);
		
		fredo.setRate(100);
		
		fredo.Salary();
		savage.Salary();
		cheef.Salary();
		
		fredo.Bonuse();
		savage.Bonuse();
		cheef.Bonuse();
		
		System.out.println(Employee.getTotalSumm());
		
		

	}

}
