package t2;

public class ContractEmployee extends Employee implements CalculatePay {
    private String federalTaxIdmember;

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee() {
    }

    public ContractEmployee(String federalTaxIdmember, String employeeId) {
        this.federalTaxIdmember = federalTaxIdmember;
        super.setEmployeeId(employeeId);
    }

    @Override
    public double calculatePay() {
        return 15000d;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                '}';
    }
}
