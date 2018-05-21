
public class Main {

	public static void main(String[] args) {
		Employee em1 = new Employee("Oleg", 1, 20);
		Employee em2 = new Employee("Vova", 10, 16);
		Employee em3 = new Employee("Ira", 5, 40);
	
		
	System.out.println(em1);
	System.out.println(em2);
	System.out.println(em3);
	
	System.out.println();
	System.out.println("Employee I Salary="+em1.Salary()+" Bonuses="+em1.Bonuses());
	System.out.println("Employee II Salary="+em2.Salary()+" Bonuses="+em2.Bonuses());
	System.out.println("Employee III Salary="+em3.Salary()+" Bonuses="+em3.Bonuses());
	
	System.out.println();
	System.out.println("Total="+Employee.getTotalSum());
	System.out.println();
	
	
	//Changing rates
	em1.changeRate(10);
	em2.changeRate(100);
	em3.changeRate(50);
	//Results after Changing rates
	System.out.println("Result after Changing rates:");
	System.out.println(em1);
	System.out.println(em2);
	System.out.println(em3);
	
	System.out.println();
	System.out.println("Employee I Salary="+em1.Salary()+" Bonuses="+em1.Bonuses());
	System.out.println("Employee II Salary="+em2.Salary()+" Bonuses="+em2.Bonuses());
	System.out.println("Employee III Salary="+em3.Salary()+" Bonuses="+em3.Bonuses());
	System.out.println();
	System.out.println("Total="+Employee.getTotalSum());


	
	
	}

}
