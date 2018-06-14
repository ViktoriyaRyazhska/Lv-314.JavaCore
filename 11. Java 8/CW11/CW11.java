import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CW11 {

	public static void main(String args[]) {

		// Print n random numbers on console using Java 8
		Random r = new Random();
		r.ints(1, 1000).limit(10).forEach(System.out::println);
		System.out.println();

		// Print n random numbers on console using Java 8 in a sorted order
		r.ints(1, 1000).limit(10).sorted().forEach(System.out::println);

		// Using Java 8 show the biggest number from n random numbers
		System.out.println(r.ints(1, 1000).limit(10).max().getAsInt());

		// Show witch today is a day of a week
		System.out.println(LocalDate.now().getDayOfWeek());

		// Show a date of first Monday for current month
		System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

		// Write a method for sorting list of Strings using Java 8
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		sortList(numbers);
		System.out.print(numbers);
	}
		static void sortList(List <Integer> list) {
			Collections.sort(list, (n1, n2) -> n1.compareTo(n2));
		}
	}
