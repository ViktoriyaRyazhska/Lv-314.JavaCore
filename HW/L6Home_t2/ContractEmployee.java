package L6Home_t2;

//Create two classes SalariedEmployee and ContractEmployee,which implement interface and are inherited from the base class.
public class ContractEmployee extends Employee implements Salary {
	private String federalTaxIdmember; // Include a description of federalTaxIdmember in the class of ContractEmployee
										// .

	ContractEmployee() {

	}

	public ContractEmployee(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	// fixed paid workers (second child).
	@Override
	public float calculatePay() {
		return 1500f;// For employees with a fixed payment the formula is: "the average monthly
						// salary = fixed monthly payment“
	}

}
