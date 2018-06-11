package String ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WString {

	public static void main(String[] args) throws IOException {
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));

		 // 1
		 String st1 = "My name is oleg. I study IT Academy";
		 String st2 = "IT";
		 boolean res = st1.contains(st2);
		 System.out.println(res);
		
		 // 2
		 String name = str.readLine();
		 String[] arr = name.split(" ");
		 char word = arr[1].toUpperCase().charAt(0);
		 char word1 = arr[2].charAt(0);
		 if (arr.length == 3) {
		 System.out.println(arr[0] + " " + word + "." + word1 + ".");
		 System.out.println(arr[1]);
		 System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
		 }else {
		 System.out.println("ERROR");
		 }
 //3
		System.out.println("Yours is name ?");
		String pattern = "[a-zA-Z0-9_]{3,15}";
		String name1 = str.readLine();
		

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name1);
		

		if (m.matches()) {
			System.out.println("You name is validity");
		} else {
			System.out.println("Sorry, change your name");
		}
	}

}
