package lwThreads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		for (int i = 0; i < 10; i++) {
			System.out.println("I study java ");
			Thread.sleep(1000);
		}

		// ----------------------------------

		MyThreadOne thread1 = new MyThreadOne();
		MyThreadTwo thread2 = new MyThreadTwo();
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("I study java "); //
		// -----------------------------------
		List<String> strArray = new ArrayList<String>();
		Arrays.asList(strArray);
		String fileName = "C:\\Users\\Stas\\eclipse-workspace\\LwThreads\\src\\lwThreads\\FileText.txt";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);
		String s;
		int i = 0;
		while ((s = br.readLine()) != null) {

			strArray.add(s);
			i++;
		}

		for (int i1 = 0; i1 < strArray.size(); i1++) {
			System.out.println(strArray.get(i1).length());
		}
		// -----
		int maxIndex = 0;
		int minIndex = 0;
		int maxLeangth = strArray.get(0).length();
		int minLeangth = strArray.get(0).length();

		for (int i1 = 1; i1 < strArray.size(); i1++) {
			if (strArray.get(i1).length() > maxLeangth) {
				maxLeangth = strArray.get(i1).length();
				maxIndex = i1;
			}

			if (strArray.get(i1).length() < minLeangth) {
				minLeangth = strArray.get(i1).length();
				minIndex = i1;
			}
		}
		System.out.println(strArray.get(maxIndex) + " max line with : " + maxLeangth + "characters ");
		System.out.println(strArray.get(minIndex) + " min line with : " + minLeangth + "characters \n \n \n ");
		// -------
		Pattern pat = Pattern.compile("var");
		for (int i1 = 0; i1 < strArray.size(); i1++) {

			Matcher match = pat.matcher(strArray.get(i1));
			if (match.find()) {
				System.out.println(strArray.get(i1));
			}
		}

	}

}
