import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
															// 1(a)
		/*
		float n []= new float[3];	
		for(int i=0; i<n.length; i++){
			System.out.println("Input float numbers");
			n[i]=scan.nextFloat();
			if(n[i]<=5 && n[i]>=-5){
				System.out.println(n[i]+" belong to the range [-5,5]");
			}
			else{
				System.out.println(n[i]+" NOT belong to the range [-5,5]");
			}
		}
		*/
															// 1(b)
		/*
		int n [] = new int [3];
		for (int i=0; i<3; i++){
			System.out.println("Input int numbers");
			n[i]=scan.nextInt();		
		}
		Arrays.sort(n);
		System.out.println("Max value ="+n[0]);
		System.out.println("Min value ="+n[n.length-1]);
		*/
		
															//1(c)
		/*
		HTTPError my_HTTP_Error_enum[] = HTTPError.values();
		short my_HTTP_Error_nummber []={400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,422,423,424,426,428,429,431,440,444,449,450,451,494,495,496,497,498,499};
		short input_nummber=scan.nextShort();
		
		for (int i=0; i<my_HTTP_Error_enum.length; i++){
			if(input_nummber==my_HTTP_Error_nummber[i])
				System.out.println(my_HTTP_Error_enum[i]);
			}
*/
															//2
		Dog dogs []=new Dog[3];
		dogs[0] = new Dog("Bob", "Akita", 3);
		dogs[1] = new Dog();
		dogs[2] = new Dog("chack", "Bloodhound", 7);

		
		dogs[1].setAge(12);
		dogs[1].setBreed("Chow chow");
		dogs[1].setName("Chack");
		
	//	dogs[1].info();
//		System.out.println(	dogs[1].check_same_name(dogs));
//		dogs[1].info();
			
		dogs[0].get_oldest_dog(dogs);
		
		
		// Unit Test ще не доробив
		
		
		
		
		
	}		

}
