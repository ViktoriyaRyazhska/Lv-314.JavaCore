
public class Employee {
	
	private String name;
	private int departmentNumber;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int departmentNumber, float salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee (" + "name = '" + name + '\'' + ", departmentNumber = " + departmentNumber + ", salary = " + salary + ')';
	}

}
