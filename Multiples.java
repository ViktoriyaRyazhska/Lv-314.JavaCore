package test;

public class Multiples {
	public static void multip () {
		int sum = 0;
		for(int i=1; i<1000; i++)
		{
		    if (i % 3 == 0 || i % 5 == 0 )
		        sum += i;
		}
		System.out.println("sum of all the multiples of 3 or 5 below 1000 =" + sum);
	}

}
