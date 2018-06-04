import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CW8_1 {

	public static void main(String[] args) {
		// Enter surname, name and patronymic on the console as a variable of type
		// String. Output on the console:
		// surnames and initials
		// name
		// name, middle name and last name
		System.out.println("Enter surname, name and patronymic");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String P[] = input.split(" ", 3);
		System.out.println(P[0] + " " + P[1].charAt(0) + "." + P[2].charAt(0) + ".");// surnames and initials
		System.out.println(P[1]);// name
		System.out.println(P[1] + " " + P[2] + " " + P[0]);// name, middle name and
		// last name

		// The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
		// underscores. Using regular expressions implement checking the user name for
		// validity. Input five names in the main method . Output a message to the
		// console of the validation of each of the entered names.
		String[] username = new String[5];
		Pattern p = Pattern.compile("[a-zA-Z_0-9]+");

		for (int i = 0; i < username.length; i++) {
			System.out.println("Enter user name " + (i + 1));
			String input2 = sc.nextLine();
			Matcher m = p.matcher(input2);
			System.out.println(m.matches());
			if (!m.matches()) {
				System.out.println("user name can be 3 to 15 characters of the Latin alphabet, numbers, underscores");
				i--;
				continue;
			}
			username[i] = input2;
		}
		System.out.println();
		for (int i = 0; i < username.length; i++) {
			System.out.println("i=" + (i + 1) + username[i]);
		}

		// Enter the two variables of type String. Determine whether the first variable
		// substring second. For example, if you typed «IT» and «IT Academy» you must
		// receive true.
		System.out.println();
		System.out.println("Write to strings");
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		Pattern p2 = Pattern.compile(string1.toLowerCase());
		Matcher m2 = p2.matcher(string2.toLowerCase());
		System.out.println("Determine whether the first variable substring second="+m2.find());

	}
}
