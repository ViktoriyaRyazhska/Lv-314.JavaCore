import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
														//1
		/*
		System.out.println("Enter in the console sentence of five words");
		String []  str = (scan.nextLine().split(" "));
		String biggest=str[0];
		
		for(int i=1; i<str.length; i++) {
			if(str[i].length()>biggest.length()){
				biggest=str[i];
			}
		}
		System.out.println("The longest word is - "+biggest+", its length is - "+biggest.length());
		StringBuilder sb = new StringBuilder(str[1]);
		sb.reverse();
		System.out.println("Second word in reverse: "+sb.toString());
		*/
		
														//2
		/*
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		while(str.contains("  ")){
		str = str.replace("  ", " ");
		}
		System.out.println(str.toString());
		*/
		
														//3
		
		String str = scan.nextLine();
		Pattern p = Pattern.compile("([$][0-9]+[\\.][0-9]{2})");
		Matcher m = p.matcher(str);
		
		
		if(m.matches()){							//Чи введено суто 	$числа.xx
			System.out.println(str);
		}
		else{
			System.out.println("Syntacsis error");
		}
		
		System.out.println("******");
													// вибирає 		$числа.xx
		while (m.find()) {
	        System.out.println(str.substring(m.start(), m.end()));
	  }
		
		
		
		
		
		
		
		

	}

}
