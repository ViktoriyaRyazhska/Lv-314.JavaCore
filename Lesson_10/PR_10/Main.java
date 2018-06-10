import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
									
											//1
		/*
		Runnable rn= new Run();
		Thread tr = new Thread(rn);
		tr.start();
			*/
											//2
		/*
		Thread tr_1 = new Thread(new Run_t2_1());
		Thread tr_2 = new Thread(new Run_t2_2());
		tr_1.start();
		tr_2.start();
		
		try {
			tr_1.join();
			tr_2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My name is …");
		*/

											//3
		 try (BufferedReader br = new BufferedReader(new FileReader("/home/leo_smb/Eclipse_workspace/PR_10/src/mytext.txt"));){
			ArrayList<String> text = new ArrayList<String>();
	//		StringBuilder s_SB = new StringBuilder();
	//		s_SB.delete(0,s_SB.length());
//			while((s_SB.append(br.readLine())) != null){
//				text.add(s_SB.toString());
//				s_SB.delete(0,s_SB.length());
//			}
			String s="";
			while((s=br.readLine()) != null){
				text.add(s);
			}
			
			StringBuilder biggest_SB = new StringBuilder(text.get(0));
			StringBuilder smallest_SB = new StringBuilder(text.get(0));
			for (int i=0; i<text.size(); i++){
				System.out.println(text.get(i)+" | length - "+text.get(i).length());
			}
			
			System.out.println();
			System.out.println("Line, that has \"var\":");
			
			for (int i=0; i<text.size(); i++){
				if(text.get(i).length()>biggest_SB.length()){
					biggest_SB.delete(0,biggest_SB.length());
					biggest_SB.append(text.get(i));
				}
				if(text.get(i).length()<smallest_SB.length()){
					smallest_SB.delete(0,smallest_SB.length());
					smallest_SB.append(text.get(i));
				}
				if(text.get(i).equals("var")){
					System.out.println(text.get(i)+" | possition is "+i);
				}
			}
			System.out.println();
			System.out.println("The biggest line is \""+biggest_SB.toString()+"\" | it length is "+biggest_SB.length());
			System.out.println("The smallest line is \""+smallest_SB.toString()+"\" | it length is "+smallest_SB.length());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
	}
}
