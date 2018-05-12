import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1T1 {
	public static void main(String[] args) throws IOException
	{
		//Task 1
		BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter R:");
		int a = Integer.parseInt(ent.readLine());
		double P= (a*2*Math.PI);
		double S=Math.pow(a, 2) * Math.PI;
		System.out.println("Perimeter ="+ P + "   Area="+S);
	}
	}



