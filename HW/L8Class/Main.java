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
		/* Task 2 Validation name */
		String[] names = { "Ilkiv", "S()vycz", "Eroh@r", "Groot", "Otika>a" };
		for (int i = 0; i < names.length; i++)
			System.out.println(validation(names[i]));
		/* Task 3 If you typed «IT» and «IT Academy» you must receive true. */
		String what_to_find = "Ilkiv";
		String where_to_find = "Ilkiv Petro Volodimirovicz";
		System.out.println(containsText(what_to_find, where_to_find));
	}

	// Display string with a specific request
	public static void requestToMyString(String s, int request) {
		String[] parts = s.split(" ");
		s = request == 1 ? parts[0] + parts[1].charAt(0) + parts[2].charAt(0)
				: request == 2 ? parts[1] : request == 3 ? parts[1] + parts[2] + parts[0] : "Wrong request!";
		System.out.println(s);
	}
	// Name must be written in latin letters,length must be 3to15, and can contain "_"
	public static boolean validation(String check_name) {
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(check_name);
		return m.matches();
	}
	// Find word in the text
	public static boolean containsText(String what_to_find, String where_to_find) {
		Pattern contains_text = Pattern.compile(what_to_find);
		Matcher m = contains_text.matcher(where_to_find);
		return m.find();
	}
}
