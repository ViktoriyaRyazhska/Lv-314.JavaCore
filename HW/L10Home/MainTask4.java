package L10Home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
								// NOT READY YET
public class MainTask4 {
/*Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date. 
*/
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("info.txt"));
		List<String> list_of_linestring = new ArrayList<>();
		while (read.ready()) { 
			list_of_linestring.add(read.readLine());
		}
		read.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("fInfo.txt"));
		bw.write("");
		bw.close();
	}

}
