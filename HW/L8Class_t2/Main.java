package L8Class_t2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 *  Using regular expressions implement checking the user name for validity. 
 *  Input five names in the main method . 
 *  Output a message to the console of the validation of each of the entered names.
*/
public class Main {

	public static void main(String[] args) {
		String[] names = { "Ilkiv", "S()vycz", "Eroh@r", "Groot", "Otika>a" };
		for (int i = 0; i < names.length; i++)
			System.out.println(validation(names[i]));
	}

	public static boolean validation(String check_name) {
		Pattern p = Pattern.compile("\\w{3,15}");
		Matcher m = p.matcher(check_name);
		return m.matches();
	}
}
