public class Employee {
	private String name;
	private int rate;
	private double hour;
	private static int totalSum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public Employee() {
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, double hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
	}	
public double salary() {
	return this.rate*this.hour;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", rate=" + rate + ", hour=" + hour + "]";
}
public void changeRate (int rate) {
	this.rate=rate;
}
public double bonuses () {
	return this.salary()*0.1;
}
}
