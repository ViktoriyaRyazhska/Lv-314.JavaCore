package Lesson5ClassWorkPart2;

/*Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.
*/
public class Employee {
	private String name;
	private int department_number;
	private double salary = 0;

	public Employee() {
	}

	public Employee(String name, int departmentnumber, double salary) {

		this.name = name;
		this.department_number = departmentnumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentnumber() {
		return department_number;
	}

	public void setDepartmentnumber(int departmentnumber) {
		this.department_number = departmentnumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// show employees in one department
	public static void showSameDepartment(Employee[] array, int department_number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].department_number == department_number) {
				System.out.println("The " + array[i].name + " is in deparment #" + department_number);
			}
		}
	}

	public static void showEmployeers(Employee[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("The name:" + array[i].name + " department¹ " + array[i].department_number + " salary "
					+ array[i].salary);
		}
	}

	// Sort array by salary
	public static Employee[] sortingArray(Employee[] array) {

		Employee dummy = new Employee();
		// bubble
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].salary > array[j].salary) {
					dummy = array[i];
					array[i] = array[j];
					array[j] = dummy;
				}
			}
		}
		return array;
	}
}
