import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	private String name;
	private int department_number;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartment_number() {
		return department_number;
	}
	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(){}
	
	public Employee(String name, int department_number, double salary) {
		super();
		this.name = name;
		this.department_number = department_number;
		this.salary = salary;
	}
	
	public static void info_of_department(int department_number, Employee [] employees){
		for (int i=0; i<employees.length; i++){
			if(employees[i].getDepartment_number()==department_number){
				System.out.println("Name - "+employees[i].getName()+", salary - "+employees[i].getSalary());
			}
		}
	}
	
	public static void sort_workers_by_salary(Employee [] employees){
		Arrays.sort(employees, new Comparator<Employee>(){		
			public int compare(Employee o1, Employee o2) {
	            double t=(o2.getSalary() - o1.getSalary());	
	            if(t<0) {
	            	return -1;
	            }
	            else if(t>0) {
	            	return 1;
	            }
	        //    else {
	        //    	return 0;
	         //   }      	
		}
	});
	}
		
		public static void sOut_sort_workers_by_salary(Employee [] employees){
			System.out.println("The biggest salary has "+employees[0].getName()+", he(she) has "+employees[0].getSalary());
			for (int i=1; i<employees.length; i++){
				System.out.println("Employee which smaller salary than the previous one is "+employees[i].getName()+", he(she) has "+employees[i].getSalary());
			}
		}
		
		
		
	
	
	

}
