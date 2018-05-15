public class Main {

	public static void main(String[] args) {

		Person Bill= new Person("Bill",2000);
		Person Mike= new Person();
		Person Ann= new Person();
		Person Tendy= new Person();
		Person Angela= new Person("Angela", 1973);
		
		Mike.intput("Mike", 1958);
		Tendy.changeName("Tendy");
		Ann.setName("Ann");
		Ann.setBirthYear(1996);
		
		System.out.println(	Ann.getBirthYear());
		System.out.println(Ann.getName());
		System.out.println(Tendy.output());
		
//		System.out.println(Bill.age());
//		System.out.println(Bill.output());
//		Bill.intput("Bill_1", 2001);
//		System.out.println(Bill.output());
//		Bill.changeName("Bill_3");
//		System.out.println(Bill.output());
	}

}
