public class Main {
	public static void main(String[] args) {
		
		Employee Lidia = new Employee("Lidia", 200, 100);
		Employee Ann = new Employee("Ann", 100, 200);
		Employee Max = new Employee("Max", 50, 70);
		
		Max.changeRate(77);
		
		Lidia.all_Time();
//		System.out.println(Ann.bonuses(10));
//		System.out.println(Ann.salary());
//		System.out.println(Lidia.getHours());
		
		System.out.println(Ann.getName());
		System.out.println(Ann.getHours());
		System.out.println(Ann.getRate());

		Ann.setName("Ann_2");
		Ann.setHours(10);
		Ann.setRate(10);
		
		System.out.println(Ann.getName());
		System.out.println(Ann.getHours());
		System.out.println(Ann.getRate());
		
		Lidia.all_Time();
		
		
		System.out.println(Max.toStrig());
		
		
		
		
		
	}

}
