import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class l1 {


	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("radius?");
		int r = Integer.parseInt(br.readLine());
		System.out.println("area -" + 3.14 *r*r);
		System.out.println("perimeter -" + 2*3.14 *r);

		// exmple 2
		
		System.out.println("What is your name?");
		String name =br.readLine();
		System.out.println(name);
		System.out.println("Where are you live,"+ name +"?");
		String city =br.readLine();
		System.out.println(city2);
		
	}

	

}
