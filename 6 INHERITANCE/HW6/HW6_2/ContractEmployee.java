package HW6_2;

public class ContractEmployee extends Employee implements calculatePay {
	public int federalTaxIdmember;

	double rate;
	int hours;

	public ContractEmployee(int federalTaxIdmember, String name, double rate, int hours) {
		super(federalTaxIdmember, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public double Salary() {
		return this.rate * this.hours;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
