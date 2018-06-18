package t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int arr[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        arr[4] = Integer.parseInt(br.readLine());
        arr[5] = Integer.parseInt(br.readLine());
        arr[6] = Integer.parseInt(br.readLine());
        arr[7] = Integer.parseInt(br.readLine());
        arr[8] = Integer.parseInt(br.readLine());
        arr[9] = Integer.parseInt(br.readLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0 ; i < 5 ; ++i) {
        	sum1 += arr[i];
        }
         if (sum1 <= 0) {
        	for(int u= 5;u< 9;++u) {
        		sum2 *= arr[u];
        		sum1 +=sum2;
        	}
         }
        	 
         }
        

		

}
