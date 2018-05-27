package task_2;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Employee {

	private static int static_nummver=0;
	private String employee_Id;
	private String name;
	protected static double all_salary;
	private boolean one_Childrenl;
	private boolean second_Childrenl;
	
	public Employee(){
		this.employee_Id=""+static_nummver;
		static_nummver++;
	}
	
	public Employee(String name, boolean one_Childrenl, boolean second_Childrenl) {
		this.name = name;
		this.one_Childrenl = one_Childrenl;
		this.second_Childrenl = second_Childrenl;
		this.employee_Id=""+static_nummver;
		static_nummver++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOne_Childrenl() {
		return one_Childrenl;
	}

	public void setOne_Childrenl(boolean one_Childrenl) {
		this.one_Childrenl = one_Childrenl;
	}

	public boolean isSecond_Childrenl() {
		return second_Childrenl;
	}

	public void setSecond_Childrenl(boolean second_Childrenl) {
		this.second_Childrenl = second_Childrenl;
	}

	public String getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(String employee_Id) {
		this.employee_Id = employee_Id;
	}

	public abstract double calculatePay();
	
	
}
