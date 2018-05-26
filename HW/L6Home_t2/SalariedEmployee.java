package L6Home_t2;
//Create two classes SalariedEmployee and ContractEmployee,which implement interface and are inherited from the base class.
public class SalariedEmployee extends Employee implements Salary {
	private  float hourly_rate = 0.1f;
	private  int hours_worked = 0;
	private String socialSecurityNumber;//Describe the string variable socialSecurityNumber in the class SalariedEmployee .

	SalariedEmployee() {
	}

	SalariedEmployee(float hourly_rate, int hours_worked, String socialSecurityNumber) {
		this.hourly_rate = hourly_rate;
		this.hours_worked = hours_worked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public float getHourly_rate() {
		return hourly_rate;
	}

	public void setHourly_rate(float hourly_rate) {
		this.hourly_rate = hourly_rate;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
//Describe hourly paid workers in the relevant classes (one of the children)
	@Override
	public float calculatePay() {
		// The calculation formula for the "time-worker“ is: "the average monthly salary
		// = hourly rate * number		of hours worked“
		return this.hourly_rate * this.hours_worked;
	}

}
