import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import java.util.Scanner;




public class Main {
	public static void main(String[] args) {

		
		List<Integer> myCollection = new ArrayList <Integer>(10);
		List<Integer> new_collection = new ArrayList <Integer>();
		
			for(int i = 0; i <10; i++) {
			//	collection_1.add(i, (int)(Math.random()*21	));
				myCollection.add((int)(Math.random()*31));
			}
			
																//1.1
				for (Integer integer : myCollection) {
					if(integer>5) {
						new_collection.add(integer);
					}
					//	System.out.println(integer);
				}		
		/*
				System.out.println("******");
				
				for (Integer integer : new_collection) {
					System.out.println(integer);
				}
		*/
				/*
															//1.2
				for(int i=0; i<myCollection.size(); i++) {
					if(myCollection.get(i)>20) {
						myCollection.remove(i);
						i--;
					}
				}
				
				System.out.println("******");
				
				for (Integer integer : myCollection) {
					System.out.println(integer);
				}
				*/
															//1.3
				/*
				if(myCollection.size()>8) {
					myCollection.add(2, 1);
					myCollection.add(5, 4);
					myCollection.add(8, -3);
				}
				else {
					System.out.println("Size<=8");
				}
				for(int i=0; i<myCollection.size(); i++) {
					System.out.println("Position - "+i+", value of element – "+myCollection.get(i));
				}
			*/
															//1.4
				/*
				Collections.sort(myCollection);
				
				for (Integer integer : myCollection) {
					System.out.println(integer);
				}
	*/
				
				Map <Integer, String> employeeMap = new TreeMap <Integer, String> ();
			//	Map employeeMap_1 = new HashMap <Integer, String> ();
				
				employeeMap.put(1, "Nick");
				employeeMap.put(2, "Olga");
				employeeMap.put(3, "Ann");
				employeeMap.put(4, "Vasa");
				employeeMap.put(5, "Oleg");
				employeeMap.put(6, "Max");
				employeeMap.put(7, "Nick");
				
				//System.out.println(employeeMap);
																					//2.1
				for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
					System.out.println("Key - "+entry.getKey()+", Name - "+entry.getValue());
				}
				
																					//2.2
				Scanner scan = new Scanner(System.in);	
				
		/*
				int nummber = scan.nextInt();
				
				if (employeeMap.containsKey( nummber)) {
					System.out.println(employeeMap.get(nummber));
				}
				else {
					System.out.println("No this ID");
				}
				*/
				
				String name = scan.nextLine();

               name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
				
				if (employeeMap.containsValue(name)) {
					for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
						if (Objects.equals(name, entry.getValue())) {
							System.out.println("Name - "+entry.getValue()+", ID - "+entry.getKey());
						}
					}
				}
				else {
					System.out.println("No this Name");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
