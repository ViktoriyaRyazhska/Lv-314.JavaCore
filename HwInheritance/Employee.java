package HwInheritance;

public class Employee {
	public String employeeId;
	public String employeeName;
   
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}
    
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Employee() {
		super();
	}

	Employee(String id) {
		this.employeeId = id;
	}

	public int calulatePay() {
		return 0;
	}
}