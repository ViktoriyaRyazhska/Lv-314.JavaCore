package Task2;

public class Main2 {

	public static void main(String[] args) {
		Person[] pr = new Person[3];

		pr[0] = new Student("VovaStudent");
		pr[1] = new Cleaner("IraCleaner");
		pr[2] = new Teacher("IvanTeacher");
		for (int i = 0; i < pr.length; i++) {
			pr[i].print();
			if (pr[i] instanceof Staff) {
				((Staff) pr[i]).Salary();
			}
		}
		
		////////////////////////
		System.out.println();
		for (int i = 0; i < pr.length; i++) {
			System.out.println(pr[i].name);
		}
		System.out.println();
		System.out.println(((Teacher) pr[2]).type_person);

	}

}
