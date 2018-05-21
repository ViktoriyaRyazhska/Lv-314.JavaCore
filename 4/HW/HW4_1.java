package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Input 3 digits");
		 String input = br.readLine();
		 float a = Float.parseFloat(input);
		 String input2 = br.readLine();
		 float b = Float.parseFloat(input2);
		 String input3 = br.readLine();
		 float c = Float.parseFloat(input3);
		
		 if (a <= 5 && a >= -5 && b <= 5 && b >= -5 && c <= 5 && c >= -5) {
		 System.out.println("numbers belong to the range [-5,5]");
		 } else {
		 System.out.println("numbers out of the range [-5,5]");
		 }

		System.out.println("Input 3 integers");
		String input4 = br.readLine();
		int d = Integer.parseInt(input4);
		String input5 = br.readLine();
		int e = Integer.parseInt(input5);
		String input6 = br.readLine();
		int f = Integer.parseInt(input6);

		int[] integers = { d, e, f };
		int max = integers[0];
		for (int i = 1; i < integers.length; i++)
			max = Math.max(max, integers[i]);
		int min = integers[0];
		for (int i = 1; i < integers.length; i++)
			min = Math.min(min, integers[i]);
		System.out.println("Max=" + max);
		System.out.println("Min=" + min);

		
		System.out.println("number of HTTP Error? (401-404)");
		String input7 = br.readLine();
		int code = Integer.parseInt(input7);
		
		System.out.println(HTTPError.WriteError(code));
		
		
	}

}
