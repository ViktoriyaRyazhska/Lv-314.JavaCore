package HW6_2;

public class MainHW6_2 {

	public static void main(String[] args) {
		Employee[] em = new Employee[4];
		em[0] = new SalariedEmployee(1234, "Vova", 10000);
		em[1] = new SalariedEmployee(1111, "Ivan", 20000);
		em[2] = new ContractEmployee(22222, "Ira", 30, 48);
		em[3] = new ContractEmployee(33333, "Oleg", 5, 58);

		// Sorting by salary
		sortBySalary(em);
		outputRange(em);
	}

	private static void outputRange(Employee[] em) {
		for (int i = 0; i < em.length; i++) {
			System.out.print("ID=" + em[i].getId());
			System.out.print(" Name=" + em[i].getName());
			System.out.println(" Salary=" + em[i].Salary());
		}
	}

	private static void sortBySalary(Employee[] em) {
		Employee temp = null;
		for (int i = 0; i < em.length; i++) {
			for (int j = i + 1; j < em.length; j++) {
				if (em[i].Salary() < em[j].Salary()) {
					temp = em[i];
					em[i] = em[j];
					em[j] = temp;
				}
			}
		}
	}

}
