import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name surname, name and patronimic");
		str = scan.nextLine();
		str.trim();
		String[] arr = str.split(" ");
		if (arr.length >= 3) {
			System.out.println(arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1).toLowerCase() + " "
					+ arr[1].substring(0, 1).toUpperCase() + ". " + arr[2].substring(0, 1).toUpperCase() + ".");
			System.out.println(arr[1].substring(0, 1).toUpperCase()+arr[1].substring(1).toLowerCase());
			System.out.println(arr[0].substring(0, 1).toUpperCase()+arr[0].substring(0).toLowerCase()+
					           " "+arr[1].substring(0, 1).toUpperCase()+arr[1].substring(1).toLowerCase()+" "+
					           arr[2].substring(0, 1).toUpperCase()+arr[2].substring(1).toLowerCase());
		} else {
			System.out.println("Your name is not valid ");
		}
		
		// -----------------------------------
		String name;
		System.out.println("Enter name for validation :");
		name = scan.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z0-9_]{3,15}+");
		Matcher match=p.matcher(name);
		if (match.matches()) {
			System.out.println("You have entered right name");
		}
		else {
			System.out.println("You have entered wrong email");
		}
		// -----------------------------------
		String str1,str2;
		System.out.println("enter to string to find substring in ");
		str1=scan.nextLine();
		str2=scan.nextLine();
		Pattern substringPattern=Pattern.compile(str1);
		match=substringPattern.matcher(str2);
		System.out.println(match.find());
		

	}

}
