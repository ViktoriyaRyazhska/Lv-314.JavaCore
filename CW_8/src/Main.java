import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// substring();
		// person();
		for (int i = 0; i < 5; i++) {
			userName();
		}

	}

	public static void substring() throws IOException {
		System.out.println("Enter first String");
		String s1 = reader.readLine().toLowerCase();
		System.out.println("Enter second String");
		String s2 = reader.readLine().toLowerCase();
		System.out.println(s2.contains(s1) ? "Second string contains the first one"
				: "Second string does not contain the first one");
	}

	public static void person() throws IOException {
		System.out.println("Enter surname, name and patronymic. [Surname Name Patronymic]");
		String pers = reader.readLine();
		String[] persArr = pers.split(" ");
		System.out.println(persArr[0] + " " + persArr[1].charAt(0) + ". " + persArr[2].charAt(0) + ".");
		System.out.println(persArr[1]);
		System.out.println(persArr[1] + " " + persArr[2] + " " + persArr[0]);

	}

	public static void userName() throws IOException {
		System.out.println("Enter username");
		String pat = "\\w{3,15}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(reader.readLine());
		if (m.matches()) {
			System.out.println("Username passed the validation");
		} else {
			System.out.println("Username didn't pass the validation");
		}
	}
}
