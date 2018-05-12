import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1T3 {
	public static void main(String[] args) throws IOException
	{
		double tarif =  0.5;
		System.out.println("Enter minute for call #1:");
		BufferedReader minute = new BufferedReader(new InputStreamReader(System.in));
	double 	m1= Integer.parseInt(minute.readLine())*tarif;
	System.out.println("#2:");
	double 	m2= Integer.parseInt(minute.readLine())*tarif;
	System.out.println("#3:");
	double 	m3= Integer.parseInt(minute.readLine())*tarif;
	System.out.println("Pay for call#1:" + m1 + " #2:" + m2 + " #3:" + m3 + " All calls summary:" + (m1+m2+m3));
	
	
		
		
		
		
		
		
		
		
	}
	}


