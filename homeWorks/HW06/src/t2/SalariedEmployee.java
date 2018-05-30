package t2;

public class SalariedEmployee extends Employee implements CalculatePay {
    private double hourlyRate = 33.3;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(int numberOfHoursWorked, String socialSecurityNumber, String employeeId) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
        super.setEmployeeId(employeeId);
    }

    @Override
    public double calculatePay() {
        return hourlyRate * this.numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
