import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.MonthDay;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
															//1
		/*
		Month month[]= Month.values();
	byte n_month=scan.nextByte();
	byte [] count_of_days={31,28,31,30,31,30,31,31,30,31,30,31};
		if (n_month==2){
			System.out.println("Month number of "+n_month+" is "+month[n_month-1]+", it have "+count_of_days[n_month-1]+" days in a common years and 29 days in leap years");
		}
		else{
			System.out.println("Month number of "+n_month+" is "+month[n_month-1]+", it have "+count_of_days[n_month-1]+" days");
		}
		*/
																//2
		/*
		int [] int_arr=new int[10];
		int sum=0;
		byte count=0;
		for(int i=0; i<int_arr.length; i++){
			int_arr[i]=scan.nextInt();
		//	int_arr[i]=(int) (Math.random()*(600+1))-200;
		//	System.out.println(int_arr[i]);
		}
		for(int i=0; i<int_arr.length/2; i++){
			if(int_arr[i]>0){
				sum+=int_arr[i];
				count++;
			}
		}
		if(count!=5){
			sum=0;
			for(int i=5; i<int_arr.length; i++){
				sum+=int_arr[i];
			}	
		}	
	System.out.println(sum);
		*/
																//3
		
		/*
		int [] int_arr=new int[5];
		byte count=0;
	//	byte position=0;
		for(int i=0; i<int_arr.length; i++){
		//	int_arr[i]=scan.nextInt();
			int_arr[i]=(int) (Math.random()*(600+1))-200;
			System.out.println(int_arr[i]);
		}
																//3(a)
		
		for(int i=0; i<int_arr.length; i++){
			if(int_arr[i]>0){
				count++;
				if(count==2){
					System.out.println("Position of second positive number="+i);
				}
				else if(count < 2 && i==4){
					System.out.println("There is no one positive number on second position");  
				}
			}
			else if (count < 2 && i==4){
				System.out.println("There is no one positive number on second position");  
			}
		}
		
																//3(b)
		
		int index_of_minimum=0;
		int [] int_arr_2=new int[5];
		for(int i=0; i<int_arr.length; i++){
			int_arr_2[i]=int_arr[i];
		}
		Arrays.sort(int_arr_2);
		for(int i=0; i<int_arr.length; i++){
			if(int_arr[i]==int_arr_2[0]){
				index_of_minimum=i;
			}
		}
		System.out.println("Minimum = "+int_arr[index_of_minimum]+", it index = "+index_of_minimum);
		*/

																	//4
		/*
		Car [] cars =new Car [4];
		cars[0]=new Car("sedan", 2005, 2.2);
		cars[1]=new Car("pikup", 2005, 1.6);
		cars[2]=new Car("hatchback", 2007, 1.9);
		cars[3]=new Car("sedan", 2012, 2.1);

		Car.display_for_year(scan.nextInt(), cars);
		Car.sort_by_year(cars);
		Car.cars_info(cars);
		*/
		
		
		
		
		
		
	}
}
