package HW6_2;

public class SalariedEmployee extends Employee implements calculatePay {
	private int socialSecurityNumber;
	private double fixPayment;

	public SalariedEmployee(int socialSecurityNumber, String name, double fixPayment) {
		super(socialSecurityNumber, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixPayment = fixPayment;
	}

	@Override
	public double Salary() {
		return fixPayment;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getFixPayment() {
		return fixPayment;
	}

	public void setFixPayment(double fixPayment) {
		this.fixPayment = fixPayment;
	}

}
