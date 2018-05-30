package task_2;

import java.util.Arrays;
import java.util.Comparator;

public class ContractEmployee extends Employee implements Pay{

	private String federalTaxIdmember;
	private double month_salary;

	@Override
	public double calculatePay() {
		if(isOne_Childrenl()){
			month_salary+=(month_salary*10)/100;
			if(isSecond_Childrenl()==true){
				month_salary+=(month_salary*15)/100;
			}
		}
		return month_salary;
	}
	
	public ContractEmployee(){}
	
	public ContractEmployee(String name, boolean one_Childrenl, boolean second_Childrenl, String federalTaxIdmember, double month_salary) {
		super(name, one_Childrenl, second_Childrenl);
		this.federalTaxIdmember = federalTaxIdmember;
		this.month_salary = month_salary;
	}

	public String isFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getMonth_salary() {
		return month_salary;
	}

	public void setMonth_salary(double month_salary) {
		this.month_salary = month_salary;
	}

	public String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public static double getAll_salary() {
		return all_salary;
	}

	public boolean isOne_Childrenl() {
		return super.isOne_Childrenl();
	}

	public void setOne_Childrenl(boolean one_Childrenl) {
		super.setOne_Childrenl(one_Childrenl);
	}

	public boolean isSecond_Childrenl() {
		return super.isSecond_Childrenl();
	}

	public void setSecond_Childrenl(boolean second_Childrenl) {
		super.setSecond_Childrenl(second_Childrenl);
	}

	public String getEmployee_Id() {
		return super.getEmployee_Id();
	}

	public void setEmployee_Id(String employee_Id) {
		super.setEmployee_Id(employee_Id);
	}
	
	
}
