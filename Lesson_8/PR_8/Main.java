import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {
	public static void main(String[] args) throws IOException {

											//1
		
		/*
		 Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String [] input_arr = input.split(" ");
		System.out.println("surnames and initials : "+input_arr[0]+" "+input_arr[1].substring(0,1)+"."+input_arr[2].substring(0,1)+".");
		System.out.println("Name - "+input_arr[1]);
		System.out.println("Name, middle name and last name : "+input_arr[1]+" "+input_arr[2]+" "+input_arr[0]);
		*/
		
											//2
		
		BufferedReader b_reader = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		Pattern pattern = Pattern.compile("\\w{3,15}");
		Matcher matcher;
		String [] user_name = new String [5];
		
		for (int i=0; i<5; i++) {
			user_name[i]=b_reader.readLine();
			 matcher = pattern.matcher(user_name[i]);
			if (matcher.matches()) {
				System.out.println(user_name[i]);
			}
			else {
				System.out.println("Error syntax");
				i--;
			}
		}
		*/
		
											//3
	System.out.println(b_reader.readLine().contains(b_reader.readLine()));
		
		
		
		
		
	}

}
