import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class less1hw1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter flower bed radius(cm):");
		double r = Double.parseDouble(br.readLine());
		if (r == 0) {
			System.out.println("Sorry! Flower bed radius must be more then zero cm.");
		} else if (r < 0) {
			System.out.println("Sorry! Flower bed radius can not be less then zero cm.");
		} else {
			double p,s;
			p = 2*Math.PI*r; 
			s = Math.PI*Math.pow(r,2);
			String s1 = String.format("%.2f",s);
			System.out.println("flower bed perimeter: "+ p +"cm or "+p/100+"m");
			System.out.print("flower bed area: "+ s1 +"cm2 or "+ String.format("%.2f",(s/100))+"m2");
		}
	}
}