package HwInheritance;

public class ContractEmployee extends Employee implements CalculatePay{
private int federalTaxIdMember;
private int fixedPayment;
ContractEmployee (String name, String id, int federalTaxIdMember, int fixedPayment ){
	this.employeeName=name;
	this.employeeId=id;
	this.federalTaxIdMember=federalTaxIdMember;
	this.fixedPayment=fixedPayment;
	
}	@Override
public String toString() {
	return  super.toString()
			+ " "+this.calulatePay();
}
	@Override
	public int calulatePay() {
		return fixedPayment;
		
	}
	

}
