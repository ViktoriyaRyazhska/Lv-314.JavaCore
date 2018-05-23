import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

				/*																// 1
		int [] int_arr =new int[10];
		
		for (int i=0; i<int_arr.length; i++){
			int_arr[i]=(int) (Math.random()*(600+1))-200;
		//	System.out.println(int_arr[i]);
		}	
																				//1(a)
		Arrays.sort(int_arr);
		System.out.println("The biggest numbers - "+int_arr[int_arr.length-1]);
																				//1(b)
		int summ_positive=0;
		byte count_of_positive=0;
		for (int i=0; i<int_arr.length; i++){
		 	if(int_arr[i]>0){
		 		summ_positive+=int_arr[i];
		 		count_of_positive++;
		 	}
		}
		System.out.println("Summ of positive numbers = "+summ_positive);
																				//1(c)
		int summ_negative=0;
		byte count_of_negative=0;
		for (int i=0; i<int_arr.length; i++){
			if(int_arr[i]<0){
				summ_negative+=int_arr[i];
				count_of_negative++;
			}
		}
		System.out.println("Summ of negative numbers = "+summ_negative);
																				//1(d)
		if(count_of_positive<count_of_negative){
			System.out.println("Negative are more then positive");
		}
		else if(count_of_positive>count_of_negative){
			System.out.println("Positive are more then negative");
		}
		else{
			System.out.println("Positive and negative are equal numbers");
		}
		*/
		
		
															//2
		Employee[] employees= new Employee[10];
		employees[0]= new Employee("Bob", 0, 1080);
		employees[1]= new Employee("Mary", 1, 1542);
		employees[2]= new Employee("Jack", 2, 5455);
		employees[3]= new Employee("Bob", 0, 5252);
		employees[4]= new Employee("Kate", 0, 2253);
		employees[5]= new Employee("Ann", 2, 2553);
		employees[6]= new Employee("Bill", 2, 14132);
		employees[7]= new Employee("Jon", 0, 4561);
		employees[8]= new Employee("Skot", 1, 741);
		employees[9]= new Employee("Charli", 3, 4457);

		
		
		Scanner scan=new Scanner(System.in);
	//	System.out.println("Input nummber of depantment");
		
		
	//	Employee.info_of_department(0, employees);
		Employee.sort_workers_by_salary(employees);
		Employee.sOut_sort_workers_by_salary(employees);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
