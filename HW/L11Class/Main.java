package L11Class;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Main {
	public static void main(String[] args) {
		int[] array =new int[10];
		Arrays.setAll(array, i -> new Random().nextInt(10)); //task 1
		Arrays.sort(array); //task 2
		System.out.println(array[array.length-1]); //task 3
		System.out.println(new Date().getDay()); //task 4
		System.out.println(LocalDate.now().with(firstInMonth(DayOfWeek.MONDAY))); //task 5
		new ArrayList<String>().sort((s1, s2) -> s1.compareTo(s2)); //task 6
	}
}
