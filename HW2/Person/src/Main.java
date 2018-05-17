
public class Main {

	public static void main(String[] args) {
		Person pr1 = new Person();
		Person pr2 = new Person("Vova", 1985);
		Person pr3 = new Person("Ira", 1988);
		Person pr4 = new Person();
		Person pr5 = new Person();
		
		
		pr1.input("Igor", 2000);
		pr4.input("Olga", 2017);
		pr5.input("Mara", 2016);
		
		
		pr1.output();
		pr2.output();
		pr3.output();
		pr4.output();
		pr5.output();
	
	
	
	
	}

}
