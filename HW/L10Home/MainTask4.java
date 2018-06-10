package L10Home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTask4 {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\петро\\eclipse-workspace\\Tasks Java\\Hw\\src\\L10Home\\info.txt"));
		List<String> list_of_linestring = new ArrayList<>();
		while (read.ready()) {
			list_of_linestring.add(read.readLine());
		}
		read.close();
		list_of_linestring.sort((s1, s2) -> s1.length() - s2.length());
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\петро\\eclipse-workspace\\Tasks Java\\Hw\\src\\L10Home\\fInfo.txt"));
		bw.write(list_of_linestring.size()+"\n" + list_of_linestring.get(list_of_linestring.size() - 1)+"\n" + "I.Petro 1983");
		bw.close();
	}

}
