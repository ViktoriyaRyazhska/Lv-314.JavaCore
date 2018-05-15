import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class less1hw3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t,q,call,total=0;
		System.out.print("Please enter the cost in units per minute: ");
		double unitsPerMinute = Double.parseDouble(br.readLine());
		System.out.print("quantity of calls: ");
		q = Integer.parseInt(br.readLine());
		for(t=1;t<=q;t++){  
			System.out.print("Call-"+t+" duration ");
			call = Integer.parseInt(br.readLine());
			total = total + call;
			double avgD = total/t;
			System.out.println("Call-" +t+ " >> Duration: "+call+"min; Cost: "+unitsPerMinute*call +"unit; Total: " + total + "min; Total cost: "+total*unitsPerMinute+"units;");
			System.out.println("AVG >> duration:"+ avgD+"; Cost:"+total*unitsPerMinute/t);
			System.out.println("-------------");
		}
		System.out.println("--- TOTAL ---");
		System.out.println("Calls: "+(t-1));
		System.out.println("Minutes: "+total);
		System.out.println("Price: "+String.format("%.2f",total*unitsPerMinute)+" units");		
	}
}