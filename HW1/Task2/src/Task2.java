import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException { 
	
		double R, P, S ;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("What is your adress, "+name+"?");
		String ad = br.readLine();
		
		System.out.println(name+", "+ad);
		
				
		}
		
		
	}

	

