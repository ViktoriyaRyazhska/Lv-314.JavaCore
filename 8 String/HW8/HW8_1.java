import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW8_1 {

	public static void main(String[] args) {

		// Enter in the console sentence of five words.
		// display the longest word in the sentence
		// determine the number of its letters
		// bring the second word in reverse order
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in the console sentence of five words");
		String input = sc.nextLine();
		String S[] = input.split(" ");
		String longest = S[0];

		for (int i = 0; i < S.length; i++) {
			if (longest.length() < S[i].length()) {
				longest = S[i];
			}
		}

		System.out.println("the longest word is " + longest);
		System.out.println("it has " + longest.length() + " letters");

		// reverse the second word
		StringBuilder sb = new StringBuilder(S[1]);
		System.out.println("reverse the second word " + sb.reverse());

		// Enter a sentence that contains the words between more than one space. Convert
		// all spaces, consecutive, one. For example, if we introduce the sentence "I am
		// learning Java Core», we have to get the "I'm learning Java Core» (replace)
		System.out.println("Enter a sentence that contains the words between more than one space");
		String input2 = sc.nextLine();
		do {
			input2 = input2.replace("  ", " ");
		} while (input2.contains("  "));
		System.out.println(input2);

		// Implement a pattern for US currency: the first symbol "$", then any number of
		// digits, dot and two digits after the dot. Enter the text from the console
		// that contains several occurrences of US currency. Display all occurrences on
		// the screen.
		System.out.println();
		String text = "asdfjkls sdflk $0.23 ljhsdfjh ldfkj $52354235.22234 df $.234";
		Pattern p = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}
	}

}
