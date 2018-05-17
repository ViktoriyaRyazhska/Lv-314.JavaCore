package t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import t2.DayOfWeek;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of week: ");
		System.out.println(DayOfWeek.showDay(Integer.parseInt(x.readLine())));
	}

}
