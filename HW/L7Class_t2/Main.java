package L7Class_t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	/*
	 * In the main() method declare map employeeMap of pairs <Integer, String>. Add
	 * to employeeMap seven pairs (ID, name) of some persons. Display the map on the
	 * screen. /Ask user to enter ID, then find and write corresponding name from
	 * your map. If you can't find this ID - say about it to user (use function
	 * containsKey()). Ask user to enter name, verify than you have name in your map
	 * and write corresponding ID. If you can't find this name - say about it to
	 * user (use function containsValue()).
	 */
	public static Map<Integer, String> employeeMap = new HashMap<Integer, String>();

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		employeeMap.put(1, "Petro");
		employeeMap.put(2, "Mykola");
		employeeMap.put(3, "Oksana");
		employeeMap.put(4, "Oleg");
		employeeMap.put(5, "Sveta");
		employeeMap.put(6, "Oleksandr");
		employeeMap.put(7, "Myron");

		System.out.println("Enter the ID:");
		findValuePerKey(Integer.parseInt(reader.readLine()));
		System.out.println("Enter the Name:");
		findKeyPerValue(reader.readLine());
	}

	public static void findValuePerKey(Integer ID) {
		if (employeeMap.containsKey(ID)) {
			System.out.println(employeeMap.get(ID));
		} else {
			System.out.println("Can't find this ID");
		}
	}

	public static void findKeyPerValue(String s) {
		if (employeeMap.containsValue(s)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(s)) {
					System.out.println("ID:" + entry.getKey());
				}
			}
		} else {
			System.out.println("Can't find this Name");
		}
	}

}
