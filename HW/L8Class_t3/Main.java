package L8Class_t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Enter the two variables of type String. 
 * Determine whether the first variable substring second. 
 * For example, if you typed «IT» and «IT Academy» you must receive true.
*/
public class Main {

	public static void main(String[] args) {
		String what_to_find = "Ilkiv";
		String where_to_find = "Ilkiv Petro Volodimirovicz";
		System.out.println(containsText(what_to_find, where_to_find));
	}

	public static boolean containsText(String what_to_find, String where_to_find) {
		Pattern contains_text = Pattern.compile(what_to_find);
		Matcher m = contains_text.matcher(where_to_find);
		return m.find();
	}
}
