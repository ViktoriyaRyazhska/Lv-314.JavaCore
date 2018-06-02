package L8Home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String text = "I have  $4   i  buy 1 uah   and now i have $3.95    difference was  $0.05";
		/*Task 1 display longest word and number of letters and second word in reverse*/
		System.out.println(requestForText(text, 1));
		System.out.println(requestForText(text, 2));
		System.out.println(requestForText(text, 3));
		/*Task 2 replace all spaces*/
		System.out.println(text.replaceAll(" +", " "));
		/*Task 3 Find all dollars*/
		findDollar(text);
		
	}

	public static String requestForText(String s, int request) {
		String[] word = s.split(" ");
		int longest_word = word[0].length();
		int pos = 0;
		for (int i = 1; i < word.length; i++) {
			if (longest_word < word[i].length()) {
				longest_word = word[i].length();
				pos = i;
			}
		}
		s = request == 1 ? word[pos]
				: request == 2 ? ("" + longest_word)
						: request == 3 ? new StringBuilder(word[1]).reverse().toString() : "Something went wrong";
		return s;
	}
	
	public static void findDollar(String s) {
		String pat = "\\$(\\d*)(\\.\\d{2})?";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(s.substring(m.start(), m.end()));
		}
	}
}
