
public class Employee {
	
	private static double totalSum;
	
	private String name;
	private float rate;
	private double hours;
	
	public Employee() {
		
	}
	
	public Employee(String name, float rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, float rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	
	
	public static double getTotalSum() {
		return totalSum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double Salary () {
		totalSum += this.rate*this.hours;
		return (this.rate*this.hours);
	}
	
	@Override
	public String toString() {
		return "Employee (name = " + name + " rate = " + rate + " hours = " + hours + ")";
	}
	
	public double Bonuses() {
		totalSum += this.rate*this.hours*0.1;
		return (this.rate*this.hours*0.1);
	}
	

}
