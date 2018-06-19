package test;

public class Calc {
	public static void calculate(int n) { 
		if (n < 30) {
		long result =1;
		for (int i = 1; i <= n; i++) {
         result*=i ;
		}
		System.out.println ("Input number n and calculate n! = " + result);
		}else {
			System.out.print("Error : the number is too large");
		}
		}
}
