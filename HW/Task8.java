import java.util.Scanner;

public class Task8 {

	private static String [] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
	private static String [] dozens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static void task8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number in range from 1 to 1 000 000");
		int n = scan.nextInt();
		
		if(n==1000000) {
			System.out.print("million ");
		}
		if(n<1000000) {
			int k6=n/100000;
			int k5=(n/10000)%10;
			int k4=(n/1000)%10;
			int k54=(n/1000)%100;
			int k3=(n/100)%10;
			int k2=(n/10)%10;
			int k1=n%10;
			int k21=(n%100);
			
//			System.out.println(k6);
//			System.out.println(k5);
//			System.out.println(k4);
//			System.out.println(k54);
//			System.out.println(k3);
//			System.out.println(k2);
//			System.out.println(k1);
//			System.out.println(k21+"q");
			
			System.out.print(units[k6]+" hundred");
			if(k5>=1) {									//!!!
				System.out.print(units[k54]+" thousand");
			
			}
			if((k5>=2 && k5<=9) || k5==0) {
				System.out.print(dozens[k5]+" ");
				System.out.print(units[k4]+" thousand ");
			}
			System.out.print(units[k3]+" hundred");
			if(k2>=1) {									//!!!
				System.out.print(units[k54]+" thousand");
			
			}
			if((k2>=2 && k2<=9) || k2==0) {
				System.out.print(dozens[k5]+" ");
				System.out.print(units[k4]+" ");
			}
			
			
			
			
			
		}
	}

	
	
	
}
