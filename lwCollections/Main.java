package lwCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static List<Integer> removePositions(List<Integer> list) {
		if (list.size() >= 2) {
			list.add(1, 2);
		}
		if (list.size() >= 9) {
			list.add(8, -3);
		}
		if (list.size() >= 6) {
			list.add(5, -4);
		}

		return list;

	}

	public static List<Integer> deleteGraterThan(List<Integer> list, int x) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > x) {
				list.remove(i);
				i--;
			}
		}
		return list;

	}

	/*
	 * public static List<Integer> deleteGraterThanS(List<Integer> list, int x) {
	 * 
	 * for (Integer value : list) { if (value > x) { System.out.println(value);
	 * list.remove(value); } } return list;
	 * 
	 * }
	 */

	public static List<Integer> fullfillWithRandom(List<Integer> list) {
		Random ram = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(i, ram.nextInt(40));
		}
		return list;
	}

	public static void printList(List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}

	public static void printListFormated(List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + "\t");
		}
		System.out.println("values");

		for (int i = 0; i < a.size(); i++) {
			System.out.print(i + "\t");
		}
		System.out.println("position");
	}

	public static void main(String[] args) {
		List<Integer> myArrayList = new ArrayList();
		List<Integer> myLinkedList = new LinkedList();

		Main.fullfillWithRandom(myLinkedList);
		Main.fullfillWithRandom(myArrayList);
		Main.printListFormated(myLinkedList);
		Main.printListFormated(myArrayList);

		System.out.println("Deleted grater than 20 ");
		Main.deleteGraterThan(myLinkedList, 20);
		Main.deleteGraterThan(myArrayList, 20);
		Main.printListFormated(myLinkedList);
		Main.printListFormated(myArrayList);

		System.out.println("Some removed positions ");
		Main.removePositions(myLinkedList);
		Main.removePositions(myArrayList);
		Main.printListFormated(myLinkedList);
		Main.printListFormated(myArrayList);

		Collections.sort(myLinkedList);
		Collections.sort(myArrayList);
		Main.printListFormated(myLinkedList);
		Main.printListFormated(myArrayList);
		// --------------------------------------------------
		Map<Integer, String> employeeMap = new HashMap();
		employeeMap.put(1032, "Stanislav");
		employeeMap.put(5464, "Slavik");
		employeeMap.put(9567, "Ivan");
		employeeMap.put(3567, "Georg");
		employeeMap.put(8976, "Jhon");
		employeeMap.put(2435, "Raichel");
		employeeMap.put(4567, "Lena");
		for (Map.Entry<Integer, String> EntryEmployee : employeeMap.entrySet()) {
			System.out.println(EntryEmployee.getKey() + " " + EntryEmployee.getValue());
		}
		Scanner scaner = new Scanner(System.in);
//-----------------------------------------------------------------------
		System.out.println("Enter the id number of the employee");
		int s;
		s = Integer.parseInt(scaner.nextLine());
		if (employeeMap.containsKey(s)) {
			System.out.println(employeeMap.get(s));

		} else {
			System.out.println("We have no such person");
		}
//------------------------------------------------------------------------
		System.out.println("Enter the name you are searching for: ");
		String name;
		name = scaner.nextLine();
		name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
		if (employeeMap.containsValue(name)) {
			for (Iterator iterator = employeeMap.entrySet().iterator(); iterator.hasNext();) {
				Map.Entry entry = (Map.Entry<Integer, String>) iterator.next();
				if (Objects.equals(name, entry.getValue())) {
					System.out.println("The id of a person :" + entry.getKey());
				}
			}
		} else {
			System.out.println("We do not have such person ");
		}
	}
}
