package HW_6_2;

public class SalariedEmployee extends Employee implements CalculatePay{
	
	private String socialSecurityNumber;
	double hourlyRate = 28.4d;
	int hours;

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public SalariedEmployee() {
	}


	public SalariedEmployee(String socialSecurityNumber, int hours, String employeeID, String name) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		super.setEmployeeID(employeeID);
		super.setName(name);
	}


	@Override
	public float calculatePay() {
		return (float) (this.hours * hourlyRate);
	}

}
