import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CW10_2 {

	public static void main(String[] args) throws IOException {
		// Prepare mytext.txt file with a lot of text inside.
		// Read context from file into array of strings.
		// Each array item contains one line from file.
		// Complete next tasks:

		String fileName = "C:\\Users\\Lychak_T\\Google Äèñê\\Softserve\\Person\\CW10\\text.txt";
		List<String> text = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String s;
		while ((s = br.readLine()) != null) {
			text.add(s.trim());
		}
		br.close();
		// 1) count and write the number of symbols in every line.
		for (Iterator<String> i = text.iterator(); i.hasNext();) {
			String string = (String) i.next();
			System.out.println(string.length());
		}
		// 2) find the longest and the shortest line.
		String shortest = text.get(0);
		String longest = text.get(0);
		for (Iterator<String> i = text.iterator(); i.hasNext();) {
			String string = (String) i.next();
			if (shortest.length() >= string.length()) {
				shortest = string;
			}
			if (longest.length() <= string.length()) {
				longest = string;
			}
		}
		System.out.println(shortest);
		System.out.println(longest);
		
		// 3) find and write only that lines, which consist of word «var»
		System.out.println();
		for (Iterator<String> i = text.iterator(); i.hasNext();) {
			String string = (String) i.next();
			if (string.toLowerCase().contains("some")) {
				System.out.println(string);
			}
		}
	}
}
