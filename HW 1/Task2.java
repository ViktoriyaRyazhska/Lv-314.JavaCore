
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	

public class Task2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live?");
		String adress = br.readLine();

		System.out.println("You are " + name + " and you live in " + adress);  
		



	}

}
