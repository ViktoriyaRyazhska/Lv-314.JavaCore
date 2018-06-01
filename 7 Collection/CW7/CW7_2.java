import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CW7_2 {

	public static void main(String[] args) {
		// In the main() method declare map employeeMap of pairs <Integer, String>.
		// Add to employeeMap seven pairs (ID, name) of some persons. Display the map on
		// the screen.

		// If you can't find this ID - say about it to user (use function
		// containsKey()).

		Map<Integer, String> EmployeeMap = new HashMap<Integer, String>();
		EmployeeMap.put(1111, "Vova");
		EmployeeMap.put(2222, "Ira");
		EmployeeMap.put(3333, "Sara");
		EmployeeMap.put(4444, "Gala");
		EmployeeMap.put(5555, "Nasta");
		EmployeeMap.put(6666, "Oleg");
		EmployeeMap.put(7777, "Vova");
		for (Map.Entry<Integer, String> entry : EmployeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Ask user to enter ID, then find and write corresponding name from your map.
		// If you can't find this ID - say about it to user (use function
		// containsKey()).
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ID in the console");
		int id = Integer.parseInt(sc.nextLine());
		if (EmployeeMap.containsKey(id)) {
			System.out.println("the name of this id is " + EmployeeMap.get(id));
		} else {
			System.out.println("Wrong id");
		}
		
		// Ask user to enter name, verify than you have name in your map and write
		// corresponding ID.
		// If you can't find this name - say about it to user (use function
		// containsValue()).
		System.out.println("enter name in the console");
		String name = sc.nextLine();
		
		if (EmployeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : EmployeeMap.entrySet()) {

				if (entry.getValue().equals(name)) {
					System.out.println("the id of " + name + " is " + entry.getKey());

				}
			}
		} else {
			System.out.println("Found no such name");
		}
	}
}
