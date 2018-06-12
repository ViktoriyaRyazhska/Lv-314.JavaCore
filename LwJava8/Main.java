package LwJava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	static void printList(List a) {
		a.stream().forEach(x->System.out.println(x));
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		list = random.ints(0, 20).limit(10).boxed().collect(Collectors.toList());
		Main.printList(list);
		System.out.println();
		
		list = random.ints(0, 20).limit(10).boxed().sorted().collect(Collectors.toList());
		Main.printList(list);
		System.out.println();
		
		IntSummaryStatistics status = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(status.getMax());
		System.out.println();

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

		List<String> StringList = Arrays.asList("Beta", "Gamma", "Alpha");
		StringList.stream().sorted().collect(Collectors.toList());
		
		Main.printList(StringList.stream().sorted().collect(Collectors.toList()));


	}

}
