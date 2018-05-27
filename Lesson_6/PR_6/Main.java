public class Main {

	public static void main(String[] args) {

		/*
		Animal [] animals=new Animal[5];
		animals[0] =new Cat();
		animals[1]=new Cat();
		animals[2]=new Dog();
		animals[3]=new Dog();
		animals[4]=new Dog();
		
		for (int i=0; i<animals.length; i++) {
		animals[i].voice();
		animals[i].feed();
		}
		*/
		
		Person [] all_person = new Person[5];
		all_person[0]=new Student();
		all_person[1]=new Student();
		all_person[2]=new Teacher();
		all_person[3]=new Cleaner(); 
		all_person[4]=new Teacher();
		
		for(int i=0; i<all_person.length; i++) {
			all_person[i].print();
			if(all_person[i] instanceof Staff) {
				((Staff)all_person[i]).salary(300);
			}
			
		}
		
		

	}

}
