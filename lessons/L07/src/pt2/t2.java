package pt2;

import java.io.IOException;
import java.util.Map;

import static com.homework.Main.br;

public class t2 {
    public static void input(Map<Integer, String> employeeMap) {
        employeeMap.put(1, "Stepan");
        employeeMap.put(2, "Ivan");
        employeeMap.put(3, "Oleg");
        employeeMap.put(4, "Dima");
        employeeMap.put(5, "Vasya");
        employeeMap.put(6, "Bogdan");
        employeeMap.put(7, "Zina");
    }

    public static void getMap(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> x : employeeMap.entrySet()
                ) {
            System.out.println("Value is " + x.getValue() + ", key " + x.getKey());
        }
    }

    public static void findingValueAcrossId(Map<Integer, String> employeeMap) throws IOException {
        System.out.println("Please, input user ID:");
        int id = Integer.parseInt(br.readLine());

        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));

        } else {
            System.out.println("Sorry, we haven't any employee");
        }
    }

    public static void findingIdAcrossValue(Map<Integer, String> employeeMap) throws IOException {
        System.out.println("Please, input a name of employee:");
        String name = firstUpperCase(br.readLine());

        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                String list = entry.getValue();
                if (list.equals(name)) {
                    System.out.println(entry.getKey());
                }
            }
        } else {
            System.out.println("Sorry, we haven't any employee");
        }
        System.out.println(name);
    }

    private static String firstUpperCase(String x) {
        String word = x.toLowerCase();
        if (word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
