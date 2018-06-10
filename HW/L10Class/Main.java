package L10Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception {
		task1();
		task2();
		task3();
	}

	public static void task1() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am study JAva");
			Thread.sleep(1000);
		}
	}
	public static void task2() throws InterruptedException {
		Thread first = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello word");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread second = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Peace in the peace");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		first.start();
		second.start();
		first.join();
		second.join();
		System.out.println("My name is Petro");
	}
	public static void task3() throws IOException {
		String name_file = "C:\\Users\\петро\\eclipse-workspace\\Tasks Java\\Hw\\src\\L10Class\\mytxt.txt";
		BufferedReader read = new BufferedReader(new FileReader(name_file));
		List<String> list_of_linestring = new ArrayList<>();
		while (read.ready()) { // copy .txt in arrayList
			list_of_linestring.add(read.readLine());
		}
		read.close();
		list_of_linestring.sort((s1, s2) -> s1.length() - s2.length()); // sorting by length
		System.out.println("The shortest line is:" + list_of_linestring.get(0));
		System.out.println("The longest line is:" + list_of_linestring.get(list_of_linestring.size() - 1));
		for (int i = 0; i < list_of_linestring.size(); i++) {
			if (Pattern.compile("var").matcher(list_of_linestring.get(i)).find()) {
				System.out.println(list_of_linestring.get(i));
			}
		}
	}

}
