package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sen = new BufferedReader(new InputStreamReader(System.in));
		// 1
		String s = "I am      learning            Java                Core";

		System.out.println(s.replaceAll("\\s{2,}", " "));

		// 2
		String str = sen.readLine();
		String pattern = "[$][0-9][\\.][0-9] {3}";
		Pattern p = Pattern.compile(pattern);
		Matcher dolar = p.matcher(str);
		while (dolar.find()) {
			System.out.println(str.substring(dolar.start(), dolar.end()) + " ");
		}

	}
}
