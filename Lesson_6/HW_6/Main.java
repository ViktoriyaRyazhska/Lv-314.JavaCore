import java.util.Arrays;
import java.util.Comparator;

import task_1.*;
import task_2.*;

public class Main {
	public static void main(String[] args) {
		
									//1
		/*
		Bird [] birds = new Bird[5];		
		birds[0] = new Eagle("blue", "big");
		birds[1] = new Swallow("white", "big");
		birds[2] = new Penguin("orange", "smal");
		birds[3] = new Chicken("white", "middle");
		birds[4] = new Penguin("blue", "mddle");
		
		for (int i=0; i<birds.length; i++){
			birds[i].fly();
			birds[i].info();
		}
		*/
		
									//2
		Employee [] employees = new Employee [6];
		employees [0]= new SalariedEmployee("Max", false,false, 94, 300, "N20");
		employees [1]= new ContractEmployee("Nina", true,false, "Mq02", 2345);
		employees [2]= new SalariedEmployee("Oleg", true, true, 145, 810, "OP45");
		employees [3]= new ContractEmployee("Stas", false, false, "Md78", 1854);
		employees [4]= new ContractEmployee("Andriy", true, false, "G89", 3458);
		employees [5]= new ContractEmployee();
		

		
		
			Arrays.sort(employees, new Comparator<Employee>(){		
				public int compare(Employee o2, Employee o1) {
		            double t=(o1.calculatePay() - o2.calculatePay());
		            if(t<0) {
		            	return -1;
		            }
		            else if(t>0) {
		            	return 1;
		            }
		            else{ 
		            	return 0;
		            }
			}
		            
		});
			for (int i=0; i<employees.length; i++){
				System.out.println("Salary "+employees[i].getName()+" = "+employees[i].calculatePay());
			}
		
		
			System.out.println("******************");
		
		

			for (int i=0; i<employees.length; i++){
				System.out.println("Name - "+employees[i].getName()+", ID - "+employees[i].getEmployee_Id()+", salary - "+employees[i].calculatePay());
			}
		
		
		
	}

}
