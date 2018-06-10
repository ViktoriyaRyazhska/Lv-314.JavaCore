import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main /*implements Runnable*/{
	
									//2
	
	public final static Object first = new Object();
	public final static Object second = new Object();
	/*
	public void run() {
		
		synchronized(second){
			Thread.yield();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (first) {
				System.out.println("Success!");
			}
		}
	}
	*/
	public static void main(String[] args) {

										//1
		/*
		Thread tr_1 = new Thread(new Run_1());
		Thread tr_2 = new Thread(new Run_2());
		Thread tr_3 = new Thread(new Run_3());
		
		tr_1.start();
		tr_2.start();
		
		try {
			tr_1.join();
			tr_2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tr_3.start();
		*/
		
											//2
		/*
		Thread tr_1 = new Thread(new Run_t2());
		Thread tr_2 = new Thread(new Main());
		tr_1.start();
		tr_2.start();
		*/
		
											//3
		/*
		Thread one = new Thread() {
			@Override
			public void run() {
				Thread tr_1 = new Thread(new Two());
				tr_1.start();
			}
		};
		one.start();
*/
		
											//4
		
		 try (BufferedReader br = new BufferedReader(new FileReader("/home/leo_smb/Eclipse_workspace/HW_10/src/file1.txt"));){
				ArrayList<String> text = new ArrayList<String>();
				String s="";
				while((s=br.readLine()) != null){
					text.add(s);
				}
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/leo_smb/Eclipse_workspace/HW_10/src/file2.txt"));
			bw.append("Number of lines is "+text.size());
			bw.newLine();
			bw.append("Biggest line is \""+biggest_line(text)+"\" | It length is "+biggest_line(text).length());
			bw.newLine();
			bw.append("Vitaliy. 30.09");
			bw.close();
		 } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
													//4
	public static String biggest_line(ArrayList<String> text ){
		StringBuilder biggest_SB = new StringBuilder(text.get(0));
		for (int i=0; i<text.size(); i++){
			if(text.get(i).length()>biggest_SB.length()){
				biggest_SB.delete(0,biggest_SB.length());
				biggest_SB.append(text.get(i));
			}
		}	
		return biggest_SB.toString();
	}
	
}
