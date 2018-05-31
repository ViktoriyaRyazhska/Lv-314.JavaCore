import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// fiveWords();
		// sentence();
		dollar();
	}

	public static void fiveWords() throws IOException {
		String sentence = reader.readLine();
		String[] sent = sentence.split(" ");
		int longestCh = 0;
		String longest = null;
		for (String string : sent) {
			if (string.length() > longestCh) {
				longest = string;
				longestCh = string.length();
			}
		}
		System.out.println("The longest string is " + longest + ". It's length is " + longestCh);

		StringBuilder sb = new StringBuilder(sent[1]);
		sb.reverse();
		System.out.println("Second word is " + sent[1] + ", reversed: " + sb);
	}

	public static void sentence() throws IOException {
		System.out.println("Enter the sentence");
		String sent = reader.readLine();
		sent = sent.replaceAll(" {2,}", " ");
		System.out.println(sent);
	}

	public static void dollar() throws NumberFormatException, IOException {
		System.out.println("Enter a string, containing US currency.");
		String pat = "\\$[0-9]+\\.[0-9]{2}";
		String str = reader.readLine();
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(str.substring(m.start(), m.end()) + "\n");
		}
	}

}
