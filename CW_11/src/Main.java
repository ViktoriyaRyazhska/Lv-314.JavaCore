import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		int n = 5;
		List<Integer> list = new Random().ints(n, 0, 10).boxed().collect(Collectors.toList());
		list.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		sorted.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		IntSummaryStatistics stats = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Max is " + stats.getMax());
		
		DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
		System.out.println(currentDay);
		
		LocalDate date = LocalDate.now();
		LocalDate firstMonday = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(firstMonday);
		
		List<Integer> listToSort = new Random().ints(10, 0, 20).boxed().collect(Collectors.toList());
		sorting(listToSort);
		listToSort.forEach(a -> System.out.print(a + " "));
	}
	
	private static void sorting(List<Integer> list) {
		Collections.sort(list, (n1, n2) -> n1.compareTo(n2));
	}

}
