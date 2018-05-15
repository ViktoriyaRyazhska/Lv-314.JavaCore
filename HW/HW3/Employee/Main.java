import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Employee x1 = new Employee("Petro",18,24);
		Employee x2 = new Employee("Petroo",19,25);
		Employee x3 = new Employee("Petrooo",20,26);
		System.out.println(x1.salary());
		System.out.println(x2.salary());
		System.out.println(x3.salary());
	}
}
