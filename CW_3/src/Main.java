
public class Main {

	public static void main(String[] args) {
		Employee sam = new Employee("Sam", 5f, 6d);
		Employee john = new Employee("John", 2f, 4d);
		Employee bob = new Employee("Bob", 3f, 9d);

		sam.setRate(4f);
		
		sam.Salary();
		john.Salary();
		bob.Salary();
		
		
		sam.Bonuses();
		john.Bonuses();
		bob.Bonuses();
		
				
		System.out.println(Employee.getTotalSum());
	}

}
