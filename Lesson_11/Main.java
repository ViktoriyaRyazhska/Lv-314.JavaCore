import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
			
													//1
	//	random.ints(-100,100).limit(sc.nextInt()).forEach(System.out::println);

													//2
//		random.ints(-100,100).limit(sc.nextInt()).sorted().forEach(System.out::println);
		
													//3
//		System.out.println(random.ints(-100,100).limit(sc.nextInt()).max());
		
													//4
//		System.out.println(LocalDate.now().getDayOfWeek());
		
													//5
//		System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		
													//6

		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			list.add(RandomStringUtils.randomAlphabetic(5));
		}
		list.sort((c1,c2) -> c1.compareTo(c2));
		list.forEach(System.out::println);
		
//////////////////////////////////////////////////////////////////////////////////////
		/*
		ArrayList<String> list_2 = new ArrayList<String>(10);
		list_2.forEach(x->RandomStringUtils.randomAlphabetic(10));	
		//System.out.println(list_2.size());

									// Так не виходить
		
		list_2.sort((c1,c2) -> c1.compareTo(c2));
		list_2.forEach(System.out::println);
		*/
//////////////////////////////////////////////////////////////////////////////////////
		
		
	}

}
