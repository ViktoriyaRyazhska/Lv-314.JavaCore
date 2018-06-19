import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW10_4 {

	public static void main(String[] args) throws IOException {
		// Create file1.txt file with a text about your career.
		// Read context from file into array of strings. Each array item contains one
		// line from file.
		// Write in to the file2.txt
		// 1) number of lines in file1.txt.
		// 2) the longest line in file1.txt.
		// 3) your name and birthday date.

		String fileName = "C:\\Users\\Lychak_T\\Google Диск\\Softserve\\Person\\HW10\\file1.txt";
		String fileName2 = "C:\\Users\\Lychak_T\\Google Диск\\Softserve\\Person\\HW10\\file2.txt";

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));

		// Read context from file into array of strings
		List<String> text = new ArrayList<String>();

		String s;
		while ((s = br.readLine()) != null) {
			text.add(s.trim());
		}
		br.close();
		// Write in to the file2.txt
		// 1) number of lines in file1.txt.
		bw.write("number of lines is " + text.size());
		//2) the longest line in file1.txt.
		String longest = text.get(0);
		for (Iterator<String> i = text.iterator(); i.hasNext();) {
			String string = (String) i.next();
			if (longest.length() <= string.length()) {
				longest = string;
			}
		}
		bw.write(System.getProperty("line.separator")+longest);
		
		// 3) your name and birthday date.
		bw.write(System.getProperty("line.separator")+"Taras, 01.01.9999");
		
		bw.close();
	}
}
