package LwInheritance;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Animal[] cretures=new Animal[3];
         cretures[0]=new Cat();
         cretures[1]=new Dog();
         cretures[2]=new Dog();
         
         for(int i=0;i<cretures.length;i++) {
        	System.out.println(cretures[i].voice());
        	System.out.println(cretures[i].feed());
         }
         // 
         Person[] persons =new Person[3];
         persons[0]=new Student();
         persons[1]=new Cleaner();
         persons[2]=new Teacher();
         
         for(int i=0;i<cretures.length;i++) {
        	 if (persons[i] instanceof Staff) {
        		 ((Staff)persons[i]).salary();
        	 }
           persons[i].print();         
          }
         
 
         
	}

}
