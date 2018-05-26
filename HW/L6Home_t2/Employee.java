package L6Home_t2;
//the base class Employee with a string variable employeeld
public class Employee {
	private String employee_id;
	private String name;

	public Employee() {
	}

	public Employee(String employee_id, String name) {
		super();
		this.employee_id = employee_id;
		this.name = name;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
