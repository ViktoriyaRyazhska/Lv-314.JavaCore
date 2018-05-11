import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
																						// 1
/*
  
		System.out.println("Radius:");
	Scanner scan_1= new Scanner(System.in);
	double r=scan_1.nextDouble();
	System.out.println("Perimetr= "+ 2*3.14*r);
	System.out.println("Area= "+ 3.14*Math.pow(r,2));
	
	*/
			
		/*																					//2
		System.out.println("Who are you ?");
		Scanner scan_2= new Scanner(System.in);
		String name=scan_2.nextLine();
		System.out.println("Whre are you live, "+name+" ?");
		String live=scan_2.nextLine();
		System.out.println("You name is "+name+", and you live in "+live);
		*/
		
																							//3
		Scanner scan_3= new Scanner(System.in);
		System.out.println("Price of minute for 1 country");
		double price_1=scan_3.nextDouble();
		System.out.println("Price of minute for 2 country");
		double price_2=scan_3.nextDouble();
		System.out.println("Price of minute for 3 country");
		double price_3=scan_3.nextDouble();
		
		System.out.println("Talks continued for 1 country");
		double time_1=scan_3.nextDouble();
		System.out.println("Talks continued for 2 country");
		double time_2=scan_3.nextDouble();
		System.out.println("Talks continued for 3 country");
		double time_3=scan_3.nextDouble();
		
		System.out.println("Prise for 1 call = "+price_1*time_1);
		System.out.println("Prise for 2 call = "+price_2*time_2);
		System.out.println("Prise for 3 call = "+price_3*time_3);
		System.out.println("Prise for all calls = "+((price_1*time_1)+(price_2*time_2)+(price_3*time_3)));
	}

}
