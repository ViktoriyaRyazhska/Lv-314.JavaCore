
public class Employee {

	private String name;
	private double rate;
	private double hours;
	
	private static double totalSum=0;
	
	//Contructors
	public Employee() {
	}
	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum+= Salary();
		totalSum+= Bonuses();
	}
	//Methods
	public double Salary() {
	return rate*hours;		
	}
	public double Bonuses() {
	return 0.1*Salary();		
		}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	
	//Get-Set
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void changeRate(double rate) {
		totalSum-= Salary();
		totalSum-= Bonuses();
		this.rate = rate;
		totalSum+= Salary();
		totalSum+= Bonuses();
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		totalSum-= Salary();
		totalSum-= Bonuses();
		this.hours = hours;
		totalSum+= Salary();
		totalSum+= Bonuses();
	}
	public static double getTotalSum() {
		return totalSum;
	}
	
	
}
