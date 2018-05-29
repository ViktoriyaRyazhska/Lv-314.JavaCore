import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {

		 pt_1.creatyMy();
		 pt_1.createNew();
		 pt_1.removeFromMy();
		 pt_1.insertThree();
		 pt_1.sort();

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(1, "Joseph");
		employeeMap.put(2, "Giuseppe");
		employeeMap.put(3, "Vincent");
		employeeMap.put(4, "Pablo");
		employeeMap.put(5, "Silvia");
		employeeMap.put(6, "Carlos");
		employeeMap.put(7, "Carmelita");

		for (Map.Entry<Integer, String> i : employeeMap.entrySet()) {
			System.out.println("Emplyee name is " + i.getValue() + ", ID: " + i.getKey());
		}

		System.out.println("\nEnter employee's ID");
		int id = Integer.parseInt(reader.readLine());

		if (employeeMap.containsKey(id)) {
			System.out.println("Emplyee's name with ID " + id + " is " + employeeMap.get(id));
		} else {
			System.out.println("There is no employee with ID " + id);
		}

		System.out.println("\nEnter employee's name");
		String name = reader.readLine().toLowerCase();
		String nameCapitalize = name.substring(0, 1).toUpperCase() + name.substring(1);

		if (employeeMap.containsValue(nameCapitalize)) {
			for (Map.Entry<Integer, String> i : employeeMap.entrySet()) {
				if (i.getValue().equals(nameCapitalize)) {
					System.out.println(nameCapitalize + "'s ID is:" + i.getKey());
				}
			}
		} else {
			System.out.println("There is no employee with name " + nameCapitalize);
		}
	}

}
