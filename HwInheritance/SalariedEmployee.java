package HwInheritance;

public class SalariedEmployee extends Employee implements CalculatePay {
	private int socialSecurityNumber;
	private int hourlyRate;
	private int workedHours;

	@Override
	public String toString() {
		return  super.toString()
				+ " "+this.calulatePay();
	}

	public SalariedEmployee(String name, String id,int socialSecurityNumber, int hourlyRate, int workedHours) {
		this.employeeName=name;
		this.employeeId=id;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
	}

	@Override
	public int calulatePay() {	
		return hourlyRate*workedHours;
	}
   
}
