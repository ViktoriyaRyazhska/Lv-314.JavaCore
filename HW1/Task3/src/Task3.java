import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException { 
	
		double t1, t2, t3, c1, c2, c3 ;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("What is a duration of calls in minute separately");
			String input1 = br.readLine();
			t1 = Double.parseDouble(input1);
			String input2 = br.readLine();
			t2 = Double.parseDouble(input2);
			String input3 = br.readLine();
			t3 = Double.parseDouble(input3);
		
		System.out.println("What is a price of each minute separately?");
			String input4 = br.readLine();
			c1 = Double.parseDouble(input4);
			String input5 = br.readLine();
			c2 = Double.parseDouble(input5);
			String input6 = br.readLine();
			c3 = Double.parseDouble(input6);
		System.out.println("Call 1 costs "+t1*c1+" unit.");
		System.out.println("Call 1 costs "+t2*c2+" unit.");
		System.out.println("Call 1 costs "+t3*c3+" unit.");
		System.out.println("Total cost "+(t3*c3+t2*c2+t1*c1));
	
	}
		
		
	}

	

