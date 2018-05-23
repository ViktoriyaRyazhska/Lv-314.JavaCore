
public class Employee {

	private String name;
	private int depart;
	private double salary;

	public Employee(String name, int depart, double salary) {
		this.name = name;
		this.depart = depart;
		this.salary = salary;
	}

	public static void depatfilter(Employee[] em, int n) {
		for (int i = 0; i < em.length; i++) {
			if (em[i].getDepart() == n) {
				System.out.println(em[i]);
			}
		}
	}

	public static void sortS(Employee[] em) {
		Employee tmp = em[0];
		for (int i = 0; i < em.length - 1; i++) {
			for (int j = i + 1; j < em.length; j++) {
				if (em[i].getSalary() < em[j].getSalary()) {
					tmp = em[i];
					em[i] = em[j];
					em[j] = tmp;

				}
			}
		}
		System.out.println();
		System.out.println("Sorting salary in descending order:");
		for (int i11 = 0; i11 < em.length; i11++) {
			System.out.println(em[i11]);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depart;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (depart != other.depart)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", depart=" + depart + ", salary=" + salary + "]";
	}

}
