import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Dog {
	private String name;
	private String breed;
	private int age;
	private String breed_str_arr[]= {"Affenpinscher","Akita","Azawakh","Barbet","Beagle","Bernedoodle","Bloodhound","Briard","Bulldog","Chihuahua","Chow chow","Dalmatian","Dachshund","Foxterrier","Goldendoodle","Harrier","Komondor"};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
		Breed_enum my_breed_enum[]=Breed_enum.values();
		
		for (int i=0; i<my_breed_enum.length; i++){
			if(breed==breed_str_arr[i])
				this.breed = my_breed_enum[i].toString();
			}		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(){}
			
	public Dog(String name, String breed, int i) {
		this.name = name;
		this.age = i;
		this.breed = breed;
		Breed_enum my_breed_enum[]=Breed_enum.values();
		
		for (int i1=0; i1<my_breed_enum.length; i1++){
			if(breed==breed_str_arr[i1])
				this.breed = my_breed_enum[i1].toString();
			}		
	}
	
	public void info(){
		System.out.println("name - "+name+", breed - "+breed+", age - "+age);
	}
	
	public String check_same_name(Dog [] dogs){
		int x=0;
		for(int i = 0; i < dogs.length ; i++){
			if(name.toLowerCase().equals(dogs[i].name.toLowerCase())){
				x++;
			}
		}
		return x>=2 ? "The name "+name+" is repeated" : "The name "+name+" is not repeated";	
	}
	
	public void get_oldest_dog(Dog [] dogs) {
		Arrays.sort(dogs, new Comparator<Dog>(){
			
			public int compare(Dog o1, Dog o2) {
	            return o1.age - o2.age;				
		}
	});
		System.out.println("Oldest dog is "+dogs[0].name+", it is "+dogs[0].age+" age");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
