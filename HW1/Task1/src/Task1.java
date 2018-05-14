import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException { 		
		
		double R, P, S ;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("What is a radius of a cicle?");
		String input = br.readLine();
		R = Double.parseDouble(input);
		if (R<=0)   {
			System.out.println("Incorrect format");
			return;
		}
		else {
		P = 2*Math.PI*R;
		S = Math.PI*R*R;
		System.out.println("P= "+P);
		System.out.println("S= "+S);
				
		
		}
		
	}

	}

