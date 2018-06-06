import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
															//1
		/*
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
	System.out.println(Methods.div(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine())));
		}
		catch(DivException | NumberFormatException | IOException e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of program");
		*/
		
		
																//2
		
	//	Methods.readNumber(10,50);
	
		int x=1;
		for(int i=0; i<10; i++){
			 x =Methods.readNumber(x,100);
		}
		
		System.out.println("End of program");
		
	}

}
