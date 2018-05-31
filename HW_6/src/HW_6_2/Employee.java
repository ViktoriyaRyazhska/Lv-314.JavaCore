package HW_6_2;

import java.util.Comparator;

class SalComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		return (int) ((((CalculatePay)arg1).calculatePay()) - (((CalculatePay)arg0).calculatePay()));
	}
	
}
public class Employee {
	private String employeeID;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	static SalComparator toComp = new SalComparator();

	public static SalComparator getToComp() {
		return toComp;
	}
}
