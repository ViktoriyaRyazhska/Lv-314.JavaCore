package hwThreads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static Integer resurse = 0;
	public static Integer resurse2 = 54;

	public static void main(String[] args) throws InterruptedException, IOException {

		/*
		 * DeadThread threadDead = new DeadThread(); threadDead.start();
		 * 
		 * synchronized (Main.resurse2) { try { Thread.sleep(4000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } Thread.yield();
		 * synchronized (Main.resurse) {
		 * System.out.println("Here is some text in main mathod"); } }
		 */
		// ------------------------------------------------------
		Thread thread1 = new ThreadOne();
		thread1.start();
		// ------------------------------------------------------

		String file1 = "C:\\Users\\Stas\\eclipse-workspace\\LwThreads\\src\\hwThreads\\file1.txt";
		String file2 = "C:\\Users\\Stas\\eclipse-workspace\\LwThreads\\src\\hwThreads\\file2.txt";
		List<String> list = new ArrayList();
		FileReader fileReader = new FileReader(file1);

		String s;
		try (BufferedReader buff = new BufferedReader(fileReader)) {

			while ((s = buff.readLine()) != null) {
				list.add(s);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

		int longestLineIndex = 0;
		int NumCharLongestLine = list.get(0).length();
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() > NumCharLongestLine) {
				NumCharLongestLine = list.get(i).length();
				longestLineIndex = i;
			}

		}
		Pattern patName = Pattern.compile("First and Last Name:");
		Pattern patBirth = Pattern.compile("Date of birth:");
		Matcher match;
		

		try (FileWriter fileWriter = new FileWriter(file2);) {
			fileWriter.write("Number of lines in file1 : " + list.size());
			fileWriter.write(" The longest line is : " + list.get(longestLineIndex));

			for (String str : list) {
				match = patName.matcher(str);
				if (match.find()) {
					fileWriter.write(" " + str.substring(match.start(), str.length()));
				}
			}
			for (String str : list) {
				match = patBirth.matcher(str);
				if (match.find()) {
					fileWriter.write(" " + str.substring(match.start(), str.length()));
				}
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
