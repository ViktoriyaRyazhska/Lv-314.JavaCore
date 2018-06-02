package L8Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		/* Task 1 Output surname and initials,name,name middle name last name */
		String s = "Ilkiv Petro Volodimirovicz";
		requestToMyString(s, 1);// show surname and initials
		requestToMyString(s, 2);// show name
		requestToMyString(s, 3);// show name middle name last name

		/*
		 * Task 2 Validation name can be 3 to 15 characters of the Latin alphabet,
		 * numbers, and underscores.
		 */
		String[] names = { "Ilkiv", "S()vycz", "Eroh@r", "Groot", "Otika>a" };
		for (int i = 0; i < names.length; i++)
			System.out.println(validation(names[i]));

		/* Task 3 If you typed «IT» and «IT Academy» you must receive true. */
		String what_to_find = "Ilkiv";
		String where_to_find = "Ilkiv Petro Volodimirovicz";
		System.out.println(containsText(what_to_find, where_to_find));
	}

	public static void requestToMyString(String s, int request) {
		String[] parts = s.split(" ");
		StringBuilder text = new StringBuilder();
		switch (request) {
		case 1: {
			System.out.println(text.append(parts[0]).append(" ").append(parts[1].substring(0, 1)).append(".")
					.append(parts[2].substring(0, 1)));
			break;
		}
		case 2: {
			System.out.println(text.append(parts[1]));
			break;
		}
		case 3: {
			System.out.println(text.append(parts[1]).append(" ").append(parts[2]).append(" ").append(parts[0]));
			break;
		}
		default: {
			System.out.println("Wrong request!");
			break;
		}
		}
	}

	public static boolean validation(String check_name) {
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(check_name);
		return m.matches();
	}

	public static boolean containsText(String what_to_find, String where_to_find) {
		Pattern contains_text = Pattern.compile(what_to_find);
		Matcher m = contains_text.matcher(where_to_find);
		return m.find();
	}
}
