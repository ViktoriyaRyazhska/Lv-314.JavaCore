package L8Home_t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		findDollar("I have $4.04 i buy 1 uah and now i have $3.95");
	}

	public static void findDollar(String s) {
		String pat = "\\$[0-9]+\\.[0-9]{2}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(s.substring(m.start(), m.end()) + "\n");
		}
	}
}
