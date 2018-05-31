package HW_6_2;

public class ContractEmployee extends Employee implements CalculatePay{

	private String federalIDNumber;
	
	public String getFederalIDNumber() {
		return federalIDNumber;
	}

	public void setFederalIDNumber(String federalIDNumber) {
		this.federalIDNumber = federalIDNumber;
	}
	
	public ContractEmployee() {
	}

	public ContractEmployee(String federalIDNumber, String employeeID, String name) {
		this.federalIDNumber = federalIDNumber;
		super.setEmployeeID(employeeID);
		super.setName(name);
	}

	@Override
	public float calculatePay() {
		return 8000f;
	}

}
