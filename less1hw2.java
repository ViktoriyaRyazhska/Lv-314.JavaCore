import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class less1hw2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a,adress,n1,name;		
				
		System.out.print("What is your name? ");
		n1 = br.readLine();
		name = n1.substring(0, 1).toUpperCase()+n1.substring(1);
		System.out.print("Where are you live, "+name+"? ");
		a = br.readLine();
		adress = a.substring(0, 1).toUpperCase()+a.substring(1);

		System.out.println("adress: " + adress);
		System.out.println("name: " + name);
		System.out.println("date: " + new Date());
	}

}
