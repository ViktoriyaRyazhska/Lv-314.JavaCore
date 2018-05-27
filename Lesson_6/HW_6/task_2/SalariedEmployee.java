package task_2;

import java.util.Arrays;
import java.util.Comparator;

public class SalariedEmployee extends Employee implements Pay{

	private double n_hours;
	private double hourly_rate;
	private String socialSecurityNumber;


	public SalariedEmployee(){}
	
	public SalariedEmployee(String name, boolean one_Childrenl, boolean second_Childrenl, double n_hours, double hourly_rate, String socialSecurityNumber) {
		super( name, one_Childrenl, second_Childrenl);
		this.n_hours = n_hours;
		this.hourly_rate = hourly_rate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double time_worker(){
		return n_hours*hourly_rate;
	}
	
	public double time_worker(double n_hours, double hourly_rate){
		return n_hours*hourly_rate;
	}
	
	@Override
	public double calculatePay() {
		double salary = n_hours*hourly_rate;
		
		if(isOne_Childrenl()==true){
			salary+=(salary*10)/100;
			if(isSecond_Childrenl()==true){
				salary+=(salary*15)/100;
			}
		}
		return salary;
	}
	
	public double getN_hours() {
		return n_hours;
	}

	public void setN_hours(double n_hours) {
		this.n_hours = n_hours;
	}

	public double getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
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
