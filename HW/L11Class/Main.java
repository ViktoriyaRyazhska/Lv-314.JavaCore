package L11Class;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Main {

	public static void main(String[] args) {
		int[] array =new int[10];
		task1(array);
		task2(array);
		task3(array);
		task4();
		task5();
		task6(new ArrayList<String>());

	}

	public static void task1(int[] array) {
		Arrays.setAll(array, i -> new Random().nextInt(10));
		
		System.out.println(Arrays.toString(array));
	}

	public static void task2(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	public static void task3(int[] array) {
		System.out.println(array[array.length-1]);
	}
	public static void task4() {
		System.out.println(new Date().getDay());
	}
	public static void task5() {
		System.out.println(LocalDate.now().with(firstInMonth(DayOfWeek.MONDAY)));
	}
	public static void task6(List<String> s) {
		s.sort((s1, s2) -> s1.length() - s2.length());
	}
	
}
