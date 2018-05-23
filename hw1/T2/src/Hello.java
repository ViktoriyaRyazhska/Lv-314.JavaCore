import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("What is your name?" );
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println("Where are you live "+ name +"?" );
		String adres = br.readLine();
        System.out.println("You are "+ name + " you live " + adres);
	}

}
